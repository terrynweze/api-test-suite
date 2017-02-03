package com.solera.api.interviewtest.requests;

import java.io.IOException;
import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solera.api.interviewtest.payloads.responses.UsersResponse;

public class Users {
	
	// restTemplate used to fire off http requests.
	public final static RestTemplate restTemplate = new RestTemplate();
	
	/**
	 * @return
	 * 		ResponseEntity<String> containing details of all users within the system
	 * 
	 * Fires of the http GET request to /users and returns all retrieved users in a String format within a ResponseEntity
	 * 
	 */
	public static ResponseEntity<String> getUsers() {
        return restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", String.class);
    }
	
	/**
	 * @return
	 * 		UserResponse object containing details of a random user within the system
	 * 
	 * Retrieves all users from the system and then selects 1 of them at random to be returned
	 * 
	 */
	public static UsersResponse getRandomUser() {
		ObjectMapper mapper = new ObjectMapper();
		Random rand = new Random();
		UsersResponse[] users = null;
		
		try {
			users= mapper.readValue(getUsers().getBody(), UsersResponse[].class);
		}catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return users[rand.nextInt(9)];
    }

}
