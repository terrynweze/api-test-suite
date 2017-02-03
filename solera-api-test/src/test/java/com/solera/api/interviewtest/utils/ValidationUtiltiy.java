package com.solera.api.interviewtest.utils;

import java.util.regex.Pattern;

import com.solera.api.interviewtest.payloads.responses.UserPostsResponse;

public class ValidationUtiltiy {
	// regular expression for valid email formats
	private final String emailRegex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	
	public ValidationUtiltiy(){}
	
	/**
	 * @param email
	 * 		email to be validated
	 * 
	 * Validates the passed email against a regular expression
	 * 
	 * @return
	 */
	public boolean emailValidator(String email){
		return Pattern.compile(emailRegex).matcher(email).matches();
	}
	
	/**
	 * @param post
	 * 		The post to be validated
	 * @return
	 * 		'true' if post passes validation or 'false' if not
	 * 
	 * Validates the post to ensure it has a title and body, which are also not integers.
	 * 
	 */
	public boolean postValidator(UserPostsResponse post){
		if(post.getId() == -1){
			return false;
		}
		
		if(post.getTitle() == null || post.getTitle().equals("") || post.getTitle().isEmpty() || post.getTitle().length() <= 0){
			return false;			
		}
		
		try{
			Integer.parseInt(post.getTitle());
			return false;
		} catch(Exception e){}
		
		if(post.getBody() == null || post.getBody().equals("") || post.getBody().isEmpty() || post.getBody().length() <= 0){
			return false;			
		}
		
		try{
			Integer.parseInt(post.getBody());
			return false;
		} catch(Exception e){}
		
		
		return true;
	}

}
