package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.qdtas_Utilities.ReportingGenerator;


public class Listeners extends BaseClass implements ITestListener{
	
	ExtentReports extent=ReportGenerator.getExtentReport();
	
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();    // Array list syntax
	
	
	
	@Override
	public void onTestStart(ITestResult result)
	{
		
	ObjectRepo.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
	extenttest.set(ObjectRepo.test);
		
	}
	
	
	@Override
    public void OnTestSucess(ITestResult result)
    {
	ObjectRepo.test.log(Status.PASS, "TestCase Pass");
    }
	
    

    @Override
    public void onTestFailure(ITestResult result)
    {
    	ObjectRepo.test.log(Status.FAIL, "TestCase Fail");
    	String src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    	ObjectRepo.test.addScreenCaptureFromBase64String(src);
    }
    
    
    @Override
    public void OnTestSkipped(ITestResult result)
    {
    	ObjectRepo.test.log(Status.SKIP,"TestCase Skip");
    }


	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	    
	}
    
    
    

}
