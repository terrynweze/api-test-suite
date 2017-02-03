package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressResponse {
	
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
