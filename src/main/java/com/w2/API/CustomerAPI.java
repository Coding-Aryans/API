package com.w2.API;

import java.util.Hashtable;

import com.w2.APISetup.SetUp;
import com.w2.TestUtililty.TestUtil;

import io.restassured.response.Response;

public class CustomerAPI extends SetUp {

	
	public static Response sendPostRequestwithValidDataArg(Hashtable<String,String> data) {
	
		Response response=TestUtil.setFormParam(data.get("arguments"),setSpecification()).post(data.get("endpoint"));
		return response;
	}
	
	
}
