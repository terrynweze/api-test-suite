package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPostsResponse {
	
//{
//	"userId": 8,
//	"id": 71,
//	"title": "et iusto veniam et illum aut fuga",
//	"body": "occaecati a doloribus\niste saepe consectetur placeat eum voluptate dolorem et\nqui quo quia voluptas\nrerum ut id enim velit est perferendis"
//}
	
	@JsonProperty
	private int userId;
	@JsonProperty
	private int id;
	@JsonProperty
	private String title;
	@JsonProperty
	private String body;
	
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
