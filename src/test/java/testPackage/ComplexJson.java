package testPackage;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import static io.restassured.RestAssured.*;

import data.Payload;
import data.ReUsableMethods;


public class ComplexJson {
	public static void main(String args[]) {
		
		String priceResponse= Payload.coursePrice();
		JsonPath json = ReUsableMethods.rawToJson(priceResponse);
//		System.out.println(rawToJson.getString("dashboard"));
		
		int noofCourses = json.getInt("courses.size()");
		System.out.println("Total Courses are "+noofCourses);
		int finalprice = 0, totalprice;
	
		
		for (int i=0; i<noofCourses;i++) {
			String title = json.getString("courses ["+ i +"].title");
//			if(title.equalsIgnoreCase("RPA")) {
				int price = json.getInt("courses["+ i +"].price");
				int copies = json.getInt("courses["+ i +"].copies");
				System.out.println("Course titles are "+ title);
				System.out.println("Course prices are "+price);
				System.out.println("Copies are "+copies);
				totalprice=price * copies;
				finalprice+=totalprice;
				
//			}
	
		}
		
		System.out.println("Final Price is "+finalprice);
		int purchaseAmount = json.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(purchaseAmount, finalprice);
		
		
//		int totalamt = json.getInt("dashboard.purchaseAmount");
//		String website = json.getString("dashboard.website");
//		
//		System.out.println("Total Amount is "+totalamt);
//		
//		System.out.println("Website is "+website);
//		
//		String title = json.getString("courses[0].title");
//	
//		System.out.println("First Title is "+title);
	}
}
