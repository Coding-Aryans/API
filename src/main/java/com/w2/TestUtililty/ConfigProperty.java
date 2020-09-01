package com.w2.TestUtililty;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"file:src/test/resources/PropertiesFiles/Config.Properties"})

public interface ConfigProperty extends Config{

	@Key("baseURI")
	String getBaseURI();
	
	@Key("basePATH")
	String getBasePath();
	
	
	@Key("secretKey")
	String getSecretKey();
	
	@Key("testReportPath")
	String getTestReportfilepath();
	
	@Key("testReportName")
	String getTestReportfilename();
	
	
	@Key("testSheetName")
	String getTestSheetName();
}
