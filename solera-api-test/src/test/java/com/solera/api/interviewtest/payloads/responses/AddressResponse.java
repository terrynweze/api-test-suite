package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressResponse {
// Visual representation of the response	
//	"address": {
//  "street": "Kulas Light",
//  "suite": "Apt. 556",
//  "city": "Gwenborough",
//  "zipcode": "92998-3874",
//  "geo": {
//    "lat": "-37.3159",
//    "lng": "81.1496"
//  }
//}
	
	// variables that represent elements within the JSON response.
	// variable names exactly match the names of elements within the JSON responses
				
	// @JsonProperty is used to identify to jackson that it is a variable associated with an element in the JSON response.
	@JsonProperty
	private String street;
	@JsonProperty
	private String suite;
	@JsonProperty
	private String city;
	@JsonProperty
	private String zipcode;
	@JsonProperty
	private GeoResponse geo;
	
	// Setter and Getter methods for declared private variables
	// Setters are required by Jackson in order to inject data from JSON responses into the AddressResponse object being created
	// Getter methods are used within test to retrieve the required data
	
	public String getStreet(){
		return street;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public String getSuite(){
		return suite;
	}
	
	public void setSuite(String suite){
		this.suite = suite;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getZipcode(){
		return zipcode;
	}
	
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
	
	public GeoResponse getGeo(){
		return geo;
	}
	
	public void setGeo(GeoResponse geo){
		this.geo = geo;
	}

}
