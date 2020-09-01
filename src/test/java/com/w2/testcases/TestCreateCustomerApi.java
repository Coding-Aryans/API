package com.w2.testcases;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Hashtable;

import org.aeonbits.owner.ConfigFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.util.JSON;
import com.w2.API.CustomerAPI;
import com.w2.APISetup.SetUp;
import com.w2.TestUtililty.ConfigProperty;
import com.w2.TestUtililty.DataProviderClass;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class TestCreateCustomerApi extends SetUp {
	
	@Test(dataProviderClass = DataProviderClass.class,dataProvider = "dp",dependsOnMethods = "m1")
	public void  validateCreateCustomerAPI(Hashtable<String,String> data) {
	
		testLevelLog.get().assignAuthor("Akshay");
		testLevelLog.get().assignCategory("Regression");
		
		Response response=CustomerAPI.sendPostRequestwithValidDataArg(data);
		
	//	Assert.assertEquals(response.statusCode(), 200);
	/*RequestSpecification spec=setSpecification().formParam("email", data.get("email"))
		.formParam("description", data.get("description")).log().all();
	
		System.out.println("--------------------------------------------------");
	Response response=spec.post(data.get("endpoint"));*/
	

	testLevelLog.get().info(response.asString());
    // response.prettyPrint();
	
	Assert.assertEquals(200, response.getStatusCode());
	//fetch email in the response
	//Assert.fail();
	
	/*String EmailInTheResponse=response.path("email");
	System.out.println("EMAIL IN THE RESPONSE="+EmailInTheResponse);
	//fetch description in the response
	
		String descriptionInTheResponse=response.path("description");
		System.out.println(" description IN THE RESPONSE="+descriptionInTheResponse);
		
		System.out.println("FOOTER="+response.path("invoice_settings.footer"));
		System.out.println("URL="+response.path("subscriptions.url"));
		
		JsonPath responsepath=new JsonPath(response.asString());
		System.out.println("EMAIL IN THE RESPONSE using Json="+responsepath.get("email"));*/
		
		
		
		

	
	}
     
	@Test(priority = 0)
	public void m1() {
		Assert.fail();
	}
	
	@Test(dataProviderClass = DataProviderClass.class,dataProvider = "dp",enabled=false)
	public void fetchlistCustomers(Hashtable<String,String> data) {
		testLevelLog.get().assignAuthor("Akshay");
		testLevelLog.get().assignCategory("Regression");
	RequestSpecification spec=setSpecification().log().all();
	
		System.out.println("--------------------------------------------------");
	Response response=spec.request(data.get("methodtype"),data.get("endpoint"));
	response.prettyPrint();
	//System.out.println("data balance in inde zeroo"+response.path("data[0].id"));
	
	
	      
	 // String id=    response.path("data.id");
		ArrayList<String> customerid=response.path("data.id");
		System.out.println(customerid);
	}
	
	
	@Test(dataProviderClass = DataProviderClass.class,dataProvider = "dp",enabled=false)
	public void validateDeleteCustomerAPI(Hashtable<String,String> data) {
		testLevelLog.get().assignAuthor("Akshay");
		testLevelLog.get().assignCategory("Regression");
		RequestSpecification spec=setSpecification().log().all();
		
		System.out.println("--------------------------------------------------");
		Response response=spec.delete(data.get("endpoint"));
		response.prettyPrint();
		Assert.assertEquals(200, response.getStatusCode());
		
	}
	


}




