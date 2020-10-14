//package testPackage;
//
//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//import data.Payload;
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//
//import com.google.gson.Gson;
//
//import data.ReUsableMethods;
//
//public class Test {
//	
//	public static void main(String args[]) {
//		
//		RestAssured.baseURI="https://rahulshettyacademy.com";
//		
//		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
//		.body(Payload.AddPlace()) .when().post("maps/api/place/add/json")
//				.then().assertThat().log().all().statusCode(200)
//				.body("scope", equalTo("APP"))
//				.header("Server", "Apache/2.4.18 (Ubuntu)")
//				.extract().response().asString();
//		System.out.println(response);
//
//		
////	get the response in String
////	convert the String to JSON object
//		
//		
//	JsonPath json = new JsonPath(response);
//	String placeId = json.getString("place_id");
//	System.out.println("Place id is "+ placeId);
//	
//	String newAddress = "Summer Walk, Africa";
//	
////	update place
//	given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
//	.body("{\r\n" + 
//			"\"place_id\":\""+placeId+"\",\r\n" + 
//			"\"address\":\""+newAddress+"\",\r\n" + 
//			"\"key\":\"qaclick123\"\r\n" + 
//			"}")
//	.when()	
//			.put("maps/api/place/update/json")
//	.then()
//			.assertThat().log().all().statusCode(200)
//			.body("msg",equalTo("Address successfully updated"));
//	
//
////	Get Place
//	
//	String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
//			.queryParam("placeId", placeId)
//	.when().put("maps/api/place/add/json")
//	.then().assertThat().log().all().statusCode(200).extract().response().asString();
//	
//	System.out.println("Get Place Response " + getPlaceResponse);
//	
////	converting the string to json
////	JsonPath json1 = new JsonPath(getPlaceResponse);
////	JsonPath json1 = ReUsableMethods.rawToJson(getPlaceResponse);
////	String actualAddress = json1.getString("address");
////	System.out.println("Actual Address is "+ actualAddress);
//    Gson gson = new Gson(); 
////    gson.fromJson(getPlaceResponse, Gson);
//
//	}
//
//}
