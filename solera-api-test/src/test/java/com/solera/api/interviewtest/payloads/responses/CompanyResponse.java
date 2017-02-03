package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyResponse {
	
//  "company": {
//  "name": "Romaguera-Crona",
//  "catchPhrase": "Multi-layered client-server neural-net",
//  "bs": "harness real-time e-markets"
//}
	
	@JsonProperty
	private String name;
	@JsonProperty
	private String catchPhrase;
	@JsonProperty
	private String bs;
	
	public String getName(){
		return name;
	}
	
	public void setLat(String name){
		this.name = name;
	}
	
	public String getCatchPhrase(){
		return catchPhrase;
	}
	
	public void setCatchPhrase(String catchPhrase){
		this.catchPhrase = catchPhrase;
	}
	
	public String getBs(){
		return bs;
	}
	
	public void setBs(String bs){
		this.bs = bs;
	}

}
