package com.w2.TestUtililty;

import com.w2.APISetup.SetUp;

import io.restassured.specification.RequestSpecification;

public class TestUtil extends SetUp {
	
	public static RequestSpecification setFormParam(String arguments,RequestSpecification respecs) {
		
		
		String[] listarguments=arguments.split(",");
		for(String singleArguments:listarguments) {
			
			
			String[] keyValue=singleArguments.split(":");
			{
				String key=keyValue[0];
				String value=keyValue[1];
				respecs.formParam(key, value);
			}
		}
		
		return respecs;
		
	
	
	}
	
	

}
