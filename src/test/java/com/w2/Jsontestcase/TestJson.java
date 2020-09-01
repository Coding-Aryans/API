package com.w2.Jsontestcase;

import static io.restassured.RestAssured.given;

import org.testng.annotations.*;

import com.w2.Pojo.GlossDef;
import com.w2.Pojo.GlossEntry;
import com.w2.Pojo.GlossList;
import com.w2.Pojo.Glossary;
import com.w2.Pojo.Glossdiv;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestJson {

	
	
	@Test(enabled=false)
	public void createGlossaryItems() {
		
	GlossDef def=new GlossDef("This is para","markup");
	def.addGlossSeeAlso("GML");
	def.addGlossSeeAlso("XML");
		
		
		
		GlossEntry entry=new GlossEntry("SGML", "SGML", "Standard Generalized Markup Language", "SGML", "ISO 8879:1986");
        entry.setGlossdef(def);
        
        GlossList list=new GlossList();
        list.setGlossentry(entry);
        
      Glossdiv div=new Glossdiv("S");
      div.setGlosslist(list);
      
      Glossary glos=new Glossary("eample of glossary");
      glos.setGloss(div);
        
     Response response= given().contentType(ContentType.JSON).log().body().body(glos).post("https://reqres.in/api/users");
     //JsonPath responsepath=new JsonPath(response.asString());
    // System.out.println("respnse in particaler field:"+ responsepath.get("gloss.glosslist.glossentry.id"));
    // System.out.println("respnse in particaler field:"+response.path("gloss.glosslist.glossentry.glossdef.glossSeeAlso[0]"));
	
	}
	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void Test() {
		System.out.println("Test");
	}
	@Test
	public void TestOne() {
		System.out.println("TestOne");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
		
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
		
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
		
	}
}
