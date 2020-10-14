package testPackage;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;


public class OAuthTest {

	public static void main(String args[]) {
		
//		given().queryParams(firstParameterName, firstParameterValue, parameterNameValuePairs)
		
		RestAssured.baseURI="https://rahulshettyacademy.com/getCourse.php";
		String asString = given().queryParam("access_token", "")
		.when()
		.get("getCourse.php").asString();
		
		System.out.println(asString);
	}
}
