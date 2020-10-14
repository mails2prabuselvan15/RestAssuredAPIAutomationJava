package oAuth;

import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class TwitterDemo {
	
	
	@Test
	public void postTweet() {
		
		ValidatableResponse statusCode = given()
		.auth()
		.oauth("p5p80ZyEDrZxzQquGIHoeD6Hh",
				"evKH9uMvQ6Ek8WE5jDUInQn5u47ovX2NtIx07yExlb1qasM9IF", 
				"582684945-EBJyzXWE9b5x5gTjy8hNR0NKLr8Si7yFsS3qxL1h", 
				"d2iIQkeHjCpbg48okkFAdd1YwKM7pynFmd9k7eLK9YvPB")
		.post("https://api.twitter.com/1.1/statuses/update.json?status=This is my Tweet via API")
		.then().assertThat().statusCode(200);
		
		System.out.println("Status Code is "+statusCode);
		
		
		
	}

}
