
package testPackage;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import data.AddPlace;
import data.Location;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SerializeTest {

	public static void main(String args[]) {
		
		AddPlace place=new AddPlace();
		place.setAccuracy(100);
		place.setAddress("Green Street, Maruthappa Chettiar thottam, Nagapattinam");
		place.setLanguage("English-IN");
		place.setName("Testing API");
		place.setPhoneNumber(324134242);
		place.setWebsite("https://google.com");
		
		List<String> list=  new ArrayList<String>();
		list.add("shoe park");
		list.add("shop");
		
		Location loc =new Location();
		loc.setLatitude(-38.383490);
		loc.setLongitude(33.427362);
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		Response response = given().queryParam("keys", "qaclick123")
		.body("")
		.when().post("maps/api/place/add/jsons")
		.then().assertThat().statusCode(200).extract().response();
	
		System.out.println(response);
	}
}
