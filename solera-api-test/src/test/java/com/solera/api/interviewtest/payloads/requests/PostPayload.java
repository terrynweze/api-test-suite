package com.solera.api.interviewtest.payloads.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostPayload {
//	{
//		title: 'foo',
//	    body: 'bar',
//	    userId: 1
//	}
	
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
	
	private PostPayload(String title, String body, int userId){
		this.title = title;
		this.body = body;
		this.userId = userId;
	}
	
	public static class PostPayloadBuilder {
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
