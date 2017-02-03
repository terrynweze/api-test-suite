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
	
	public static ResponseEntity<String> createPost(PostPayload payload){
		HttpHeaders requestHeaders = new HttpHeaders();
		HttpEntity<PostPayload> httpEntity = new HttpEntity<PostPayload>(payload, requestHeaders);
		
		return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts", HttpMethod.POST, httpEntity, String.class);
	}

}
