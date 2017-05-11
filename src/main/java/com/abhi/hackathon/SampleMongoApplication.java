package com.abhi.hackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SampleMongoApplication implements CommandLineRunner {

	@Autowired
	private ClassifiedDataReposiotry classifiedRepository;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Total data classified data "+this.classifiedRepository.findAll().size());
		
		ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringMongoConfig.class);
	MongoOperations mongoOperation =
                (MongoOperations) ctx.getBean("mongoTemplate");
	// find
			Query findUserQuery = new Query();
//			findUserQuery.addCriteria(Criteria.where("ic").is("1000"));
			ClassifiedData userA1 = mongoOperation.findOne(findUserQuery, ClassifiedData.class, "twitter_classified_data");
			System.out.println(userA1);

//		this.repository.deleteAll();

	/*	// save a couple of customers
		this.repository.save(new Customer("Alice", "Smith"));
		this.repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : this.repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(this.repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : this.repository.findByLastName("Smith")) {
			System.out.println(customer);
		}*/
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleMongoApplication.class, args);
	}

}
