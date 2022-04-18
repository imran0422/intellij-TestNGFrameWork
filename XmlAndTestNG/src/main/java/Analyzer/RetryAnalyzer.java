package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int count = 0;
	int RetryLimit = 1;
	
	public boolean retry(ITestResult result) {
		
		if (count < RetryLimit) {
			count++;
			return true;
		}
		return false;
	}

}
