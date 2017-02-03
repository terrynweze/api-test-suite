package com.solera.api.interviewtest.requests;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solera.api.interviewtest.payloads.requests.PostPayload;
import com.solera.api.interviewtest.payloads.responses.UserPostsResponse;

public class UserPosts {
	
	public static RestTemplate restTemplate = new RestTemplate();
	
	/**
	 * @param id
	 * 		The id of the user to retrieve the posts for
	 * 
	 * @return
	 * 		UserPostsResponse[] an array of UserPostResponses that contain details of each of the posts created by the user
	 * 
	 * Fires of the http GET request to /posts?userId=1 and maps the response to an array of UserPostsResponse objects
	 * 
	 */
	public static UserPostsResponse[] getUsersPosts(int id) {
		String json = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts?userId=" + Integer.toString(id), String.class).getBody();
		ObjectMapper mapper = new ObjectMapper();
		UserPostsResponse[] posts = null;
		
		try {
			posts= mapper.readValue(json, UserPostsResponse[].class);
		}catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return posts;
    }
	
	/**
	 * @param payload
	 * 		The payload/body to be passed with the POST 
	 * 
	 * @return
	 * 		ResponseEntity<String> containing details of the response to the POST request
	 * 
	 * Fires of the http POST request to /posts and returns the response from the request in a String format within a ResponseEntity
	 * 
	 */
	public static ResponseEntity<String> createPost(PostPayload payload){
		HttpHeaders requestHeaders = new HttpHeaders();
		HttpEntity<PostPayload> httpEntity = new HttpEntity<PostPayload>(payload, requestHeaders);
		
		return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts", HttpMethod.POST, httpEntity, String.class);
	}

}
