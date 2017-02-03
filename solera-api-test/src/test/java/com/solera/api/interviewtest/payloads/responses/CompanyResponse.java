package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyResponse {
// Visual representation of the response	
//  "company": {
//  "name": "Romaguera-Crona",
//  "catchPhrase": "Multi-layered client-server neural-net",
//  "bs": "harness real-time e-markets"
//}
	
	// variables that represent elements within the JSON response.
	// variable names exactly match the names of elements within the JSON responses
			
	// @JsonProperty is used to identify to jackson that it is a variable associated with an element in the JSON response.
	@JsonProperty
	private String name;
	@JsonProperty
	private String catchPhrase;
	@JsonProperty
	private String bs;
	
	// Setter and Getter methods for declared private variables
	// Setters are required by Jackson in order to inject data from JSON responses into the CompanyResponse object being created
	// Getter methods are used within test to retrieve the required data
		
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
