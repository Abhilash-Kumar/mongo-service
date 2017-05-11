package com.abhi.hackathon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public interface ClassifiedDataReposiotry extends MongoRepository<ClassifiedData, String> {
	
	

}
