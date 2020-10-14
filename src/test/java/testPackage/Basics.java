package testPackage;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import data.Payload;
import data.ReUsableMethods;

public class Basics {
	public static void main(String args[]) throws IOException {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		
		String res = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("/Users/prabuselvan/Documents/Eclipse-Workspace-Projects/rest-api-automation/src/test/java/data/file.json"))))
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("status", equalTo("OK"))
		.header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println("response "+ res);
//		Converting String to JSON
		
		JsonPath rawToJson2 = ReUsableMethods.rawToJson(res);
//		JsonPath json = new JsonPath(res);
		String place_id = rawToJson2.getString("place_id");
		System.out.println("place id is "+ place_id);

		
//Add Place --> Update place with new address --> Get place API to validate the address is updated
		
//		Update the place with new address
		
//		String newAddress="Green Street, Nagapattinam";
//		
//		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//		.body("{\n" + 
//				"    \"place_id\": \""+place_id+"\",\n" + 
//				"    \"address\" : \""+newAddress+"\",\n" + 
//				"    \"key\" : \"qaclick123\"   \n" + 
//				"}")
//		.when().log().all().put("maps/api/place/update/json")
//		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
//	
//		
////		Get Place API
//		
//		String response = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id)
//		.when().log().all().get("maps/api/place/get/json")
//		.then().assertThat().statusCode(200).extract().asString();
//		
//		JsonPath rawToJson = ReUsableMethods.rawToJson(response);
////		JsonPath json2= new JsonPath(response);
//		String address= rawToJson.getString("address");
//		Assert.assertEquals(address, newAddress);
		
		
		
}
	
	

}
