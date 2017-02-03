package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoResponse {
	
//  "geo": {
//  "lat": "-37.3159",
//  "lng": "81.1496"
//}
	
	@JsonProperty
	private String lat;
	@JsonProperty
	private String lng;
	
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
