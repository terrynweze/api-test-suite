package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoResponse {
// Visual representation of the response	
//  "geo": {
//  "lat": "-37.3159",
//  "lng": "81.1496"
//}
	
	// variables that represent elements within the JSON response.
	// variable names exactly match the names of elements within the JSON responses
			
	// @JsonProperty is used to identify to jackson that it is a variable associated with an element in the JSON response.
	@JsonProperty
	private String lat;
	@JsonProperty
	private String lng;
	
	// Setter and Getter methods for declared private variables
	// Setters are required by Jackson in order to inject data from JSON responses into the GeoResponse object being created
	// Getter methods are used within test to retrieve the required data
	
	public String getLat(){
		return lat;
	}
	
	public void setLat(String lat){
		this.lat = lat;
	}
	
	public String getLng(){
		return lng;
	}
	
	public void setLng(String lng){
		this.lng = lng;
	}

}
