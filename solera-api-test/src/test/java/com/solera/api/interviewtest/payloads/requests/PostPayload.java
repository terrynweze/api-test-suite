package com.solera.api.interviewtest.payloads.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostPayload {
// Visual representation of what the payload should look like	
//	{
//		title: 'foo',
//	    body: 'bar',
//	    userId: 1
//	}
	
	// variables that represent elements to be passed within the JSON payload.
	// variable names exactly match the names of elements within the JSON payload
					
	// @JsonProperty is used to identify to jackson that it is a variable to be passed into the JSON payload.
	@JsonProperty
	private String title;
	@JsonProperty
	private String body;
	@JsonProperty
	private int userId;
	
	
	public String getTitle(){
		return title;
	}
	
	public String getBody(){
		return body;
	}
	
	public int getUserId(){
		return userId;
	}
	
	/**
	 * @param title
	 * @param body
	 * @param userId
	 * 
	 * Constructor method for the object
	 */
	private PostPayload(String title, String body, int userId){
		this.title = title;
		this.body = body;
		this.userId = userId;
	}
	
	/**
	 * @author terry.nweze
	 * Inner class used to build the payload
	 */
	public static class PostPayloadBuilder {
		// variable names match the variable names for the main class
		private String title;
		private String body;
		private int userId;
		
		public PostPayloadBuilder setTitle(String title) {
			this.title = title;
			return this;
		}
		
		public PostPayloadBuilder setBody(String body){
			this.body = body;
			return this;
		}
		
		public PostPayloadBuilder setUserId(int userId){
			this.userId = userId;
			return this;
		}
		
		public PostPayload build(){
			return new PostPayload(title,body,userId);
		}
	}
}
