package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPostsResponse {
// Visual representation of the response	
//{
//	"userId": 8,
//	"id": 71,
//	"title": "et iusto veniam et illum aut fuga",
//	"body": "occaecati a doloribus\niste saepe consectetur placeat eum voluptate dolorem et\nqui quo quia voluptas\nrerum ut id enim velit est perferendis"
//}
	
	// variables that represent elements within the JSON response.
	// variable names exactly match the names of elements within the JSON responses
		
	// @JsonProperty is used to identify to jackson that it is a variable associated with an element in the JSON response.
	@JsonProperty
	private int userId;
	@JsonProperty
	private int id;
	@JsonProperty
	private String title;
	@JsonProperty
	private String body;
	
	// Setter and Getter methods for declared private variables
	// Setters are required by Jackson in order to inject data from JSON responses into the UserPostsResponse object being created
	// Getter methods are used within test to retrieve the required data
	
	public int getUserId(){
		return userId;
	}
	
	public void setUserId(int userId){
		this.userId = userId;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getBody(){
		return body;
	}
	
	public void setBody(String body){
		this.body = body;
	}

}
