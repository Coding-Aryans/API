package com.w2.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

	int count = 0;
	int maxtry = 3;

	public boolean retry(ITestResult result) {

		if (count < maxtry) {
			count++;
			return true;
		} else {
			return false;
		}

	}
}
