package com.solera.api.interviewtest.payloads.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
// Visual representation of the response
//{
//    "id": 1,
//    "name": "Leanne Graham",
//    "username": "Bret",
//    "email": "Sincere@april.biz",
//    "address": {
//      "street": "Kulas Light",
//      "suite": "Apt. 556",
//      "city": "Gwenborough",
//      "zipcode": "92998-3874",
//      "geo": {
//        "lat": "-37.3159",
//        "lng": "81.1496"
//      }
//    },
//    "phone": "1-770-736-8031 x56442",
//    "website": "hildegard.org",
//    "company": {
//      "name": "Romaguera-Crona",
//      "catchPhrase": "Multi-layered client-server neural-net",
//      "bs": "harness real-time e-markets"
//    }
//}

public class UsersResponse {
	// variables that represent elements within the JSON response.
	// variable names exactly match the names of elements within the JSON responses
	
	// @JsonProperty is used to identify to jackson that it is a variable associated with an element in the JSON response.
	@JsonProperty
	private int id;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String username;
	
	@JsonProperty
	private String email;
	
	@JsonProperty
	private AddressResponse address;
	
	@JsonProperty
	private String phone;
	
	@JsonProperty
	private String website;
	
	@JsonProperty
	private CompanyResponse company;
	
	// Setter and Getter methods for declared private variables
	// Setters are required by Jackson in order to inject data from JSON responses into the UserResponse object being created
	// Getter methods are used within test to retrieve the required data
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public AddressResponse getAddress(){
		return address;
	}
	
	public void setAddress(AddressResponse address){
		this.address = address;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getWebsite(){
		return website;
	}
	
	public void setWebsite(String website){
		this.website = website;
	}
	
	public CompanyResponse getCompany(){
		return company;
	}
	
	public void setCompany(CompanyResponse company){
		this.company = company;
	}

}