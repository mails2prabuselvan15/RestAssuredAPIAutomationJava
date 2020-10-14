package testPackage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import data.Payload;
import data.ReUsableMethods;


public class LibraryAPI {
	
	@Test(dataProvider = "searchProvider")
	public void addBook(String isbn, String aisle) {
		
		String finalID="";
		RestAssured.baseURI="http://216.10.245.166";
		String resp = given().header("Content-Type","application/json")
		.body(Payload.addbook(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().asString();
		
		JsonPath rawToJson = ReUsableMethods.rawToJson(resp);
		String msg = rawToJson.getString("Msg");
		String id = rawToJson.get("ID");
		
		Assert.assertEquals(msg, "successfully added");
		System.out.println("Enrolled Id is "+id);
		System.out.println("Message is "+msg);
//		Delete the added book
	}
	
	@DataProvider(name = "searchProvider")
	public Object[][] getData() {
		return new Object[][] {
			{"sdfsdf","1232423"},
			{"qwewerw","2342442"},
			{"dfgtgwe","4352352"}
		};
	}

	
}
