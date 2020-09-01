package com.w2.APISetup;



import static io.restassured.RestAssured.given;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.aeonbits.owner.ConfigFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.w2.TestUtililty.ConfigProperty;
import com.w2.TestUtililty.ExcelReader;
import com.w2.TestUtililty.ExtentManager;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class SetUp {

	public static ConfigProperty configProperty;
	
	public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/testData/APIAgrmentsTestdata.xlsx");
	/*
	 * public ExtentReports rep = ExtentManager.getInstance(); public static
	 * ExtentTest test;
	 */
	public static ExtentReports extentReport;
	public static ThreadLocal<ExtentTest> classLevelLog = new ThreadLocal<ExtentTest>();
	public static ThreadLocal<ExtentTest> testLevelLog = new ThreadLocal<ExtentTest>();
	
	
    
	@BeforeSuite
	public void beforeSuite() {
		configProperty=ConfigFactory.create(ConfigProperty.class);
		RestAssured.baseURI=configProperty.getBaseURI();
		RestAssured.basePath=configProperty.getBasePath();
		extentReport=ExtentManager.GetExtent(configProperty.getTestReportfilepath()+configProperty.getTestReportfilename());
		
	}
	
	
	@BeforeClass
	public void beforeClass() {
		
		ExtentTest classLevelTest = extentReport.createTest(getClass().getSimpleName());
		classLevelLog.set(classLevelTest);

	}
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		
//		ExtentTest test=classLevelLog.get().createNode(method.getName());
//		testLevelLog.set(test);
//		testLevelLog.get().info("Testcase:"+method.getName()+"test execution started");
		
	
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result) {
		
	/*
	 * // if(result.getStatus()==ITestResult.SUCCESS) { //
	 * testLevelLog.get().pass("test case is passed"); //
	 * System.out.println("This test case is passed"); // } // else
	 * if(result.getStatus()==ITestResult.FAILURE){ //
	 * testLevelLog.get().fail("test case is fail"); //
	 * System.out.println("This test case is fail"); // } // else
	 * if(result.getStatus()==ITestResult.SKIP) { //
	 * testLevelLog.get().skip("This test case is skipped"); //
	 * System.out.println("This test case is skipped"); // } //
	 * extentReport.flush(); }
	 */
	}
	@AfterSuite
	public void afterSuite() {
		/*
		 * configProperty=ConfigFactory.create(ConfigProperty.class);
		 * RestAssured.baseURI=configProperty.getBaseURI();
		 * RestAssured.basePath=configProperty.getBasePath();
		 */
		
	}
	
	public static RequestSpecification setSpecification() {
		RequestSpecification req=given().auth().basic(configProperty.getSecretKey(),"");
		testLevelLog.get().info("RequestSpecification set");
		//ArrayList<String> list=new ArrayList<String>();
		return req;
	}
	
}
