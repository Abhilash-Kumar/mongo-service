package com.abhi.hackathon;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "twitter_classified_data")
public class ClassifiedData {

	@Id
	private String id;

	private Date tweet_created_at;

	private String sentiment;

	private String tweet_text;

	private String classificationType;

	/**
	 * @return the _id
	 */
	public String get_id() {
		return id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(String _id) {
		this.id = _id;
	}

	/**
	 * @return the tweet_created_at
	 */
	public Date getTweet_created_at() {
		return tweet_created_at;
	}

	/**
	 * @param tweet_created_at
	 *            the tweet_created_at to set
	 */
	public void setTweet_created_at(Date tweet_created_at) {
		this.tweet_created_at = tweet_created_at;
	}

	/**
	 * @return the sentiment
	 */
	public String getSentiment() {
		return sentiment;
	}

	/**
	 * @param sentiment
	 *            the sentiment to set
	 */
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	/**
	 * @return the tweet_text
	 */
	public String getTweet_text() {
		return tweet_text;
	}

	/**
	 * @param tweet_text
	 *            the tweet_text to set
	 */
	public void setTweet_text(String tweet_text) {
		this.tweet_text = tweet_text;
	}

	/**
	 * @return the classificationType
	 */
	public String getClassificationType() {
		return classificationType;
	}

	/**
	 * @param classificationType
	 *            the classificationType to set
	 */
	public void setClassificationType(String classificationType) {
		this.classificationType = classificationType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClassifiedData [id=" + id + ", tweet_created_at="
				+ tweet_created_at + ", sentiment=" + sentiment
				+ ", tweet_text=" + tweet_text + ", classificationType="
				+ classificationType + "]";
	}

}
