package com.solera.api.interviewtest.tests;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.solera.api.interviewtest.payloads.requests.PostPayload;
import com.solera.api.interviewtest.payloads.responses.UserPostsResponse;
import com.solera.api.interviewtest.payloads.responses.UsersResponse;
import com.solera.api.interviewtest.requests.UserPosts;
import com.solera.api.interviewtest.requests.Users;
import com.solera.api.interviewtest.utils.ValidationUtiltiy;

public class ApiTests {
	private ValidationUtiltiy vu = new ValidationUtiltiy();
	
	private static UsersResponse user = null;
	
	@BeforeClass(alwaysRun = true)
	public static void setUp1(){
		user = Users.getRandomUser();
	}
	
	/**
	 * Tests that the GET /users request returns a 200 response code
	 */
	@Test(groups = { "sanity" })
	public void getUsersShouldReturn200(){
		ResponseEntity<String> response = Users.getUsers();
		Assert.assertEquals(response.getStatusCode(), HttpStatus.OK, "Incorrect response code seen for get Users request.");
	}
	
	/**
	 * Tests that a retrieved users email address is valid in format
	 * Also prints the retrieved users address to the output console
	 * 
	 */
	@Test(groups = { "sanity" })
	public void printARandomUsersAddressAndVerifyEmailFormatIsCorrect(){
		String email = user.getEmail();
		
		System.out.println("Users Address:\n" + 
			"Street: " + user.getAddress().getStreet() + "\n" +
			"Suite: " + user.getAddress().getSuite() + "\n" +
			"City: " + user.getAddress().getCity() + "\n" +
			"Zipcode: " + user.getAddress().getZipcode() + "\n" +
			"Geo - Lat: " + user.getAddress().getGeo().getLat() + "\n" +
			"Geo - Long: " + user.getAddress().getGeo().getLng()
		);
		
		Assert.assertTrue(vu.emailValidator(email), "Users email address is not a valid format: " + email);
	}
	
	/**
	 * Tests that a users post is of valid format.
	 */
	@Test(groups = { "sanity" })
	public void validateUsersPosts(){
		UserPostsResponse[] posts = UserPosts.getUsersPosts(user.getId());
		
		for(int i = 0; i < posts.length; i++){
			Assert.assertTrue(vu.postValidator(posts[i]), "The Post with id " + posts[i].getId() + " does not contain all expected elements.");
		}
	}
	
	/**
	 * Tests that it is possible to create a post for a user
	 */
	@Test(groups = { "sanity" })
	public void CreateAValidPostFunctionsAsExpected(){
		PostPayload payload = new PostPayload.PostPayloadBuilder()
				.setTitle("MyTest")
				.setBody("My Body")
				.setUserId(user.getId())
				.build();
		
		ResponseEntity<String> response = UserPosts.createPost(payload);
		Assert.assertEquals(response.getStatusCode(), HttpStatus.CREATED, "Post was not created, expected a HTTP Create (201) response.");
	}	
	
}