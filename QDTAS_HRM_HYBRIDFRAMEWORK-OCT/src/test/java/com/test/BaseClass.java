package com.test;


import org.apache.log4j.Logger;

import java.io.IOException;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Utility.Readconfig;
import com.Utility.Screenshot;

//import net.bytebuddy.utility.RandomString;






public class BaseClass {
	
	
	com.Utility.Readconfig readconfig=new Readconfig();

	public String baseURL= "https://qdtas-hrm-front-end.vercel.app/";   //readconfig.getApplicationURL();                      //"https://qdtas-hrm-front-end.vercel.app/";
    public String email= "admin@gmail.com";                            //readconfig.getEmail();                                 //"admin@gmail.com";
    public String password= "123@Admin";                               //readconfig.getPassword();                           //"123@Admin";
    public static WebDriver driver;
    
    public static Logger logger;
    
    
    @Parameters("browser")
    @BeforeClass
    public void setup(String br)                     //(String br)
    {
    	
    	logger=Logger.getLogger("qdtas-hrm");
    	PropertyConfigurator.configure("Log4j.Properties");
    	
    	
    	if(br.equals("chrome"))
    	{
    	System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());               //readconfig.getchromepath());            //System.getProperty("user.dir")+"//Drivers//chromedriver.exe");     //readconfig.getchromepath());                            //System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
    	driver=new ChromeDriver();
    	}
    	else if(br.equals("firefox"))
    		
    	{
    		System.setProperty("webdriver.chrome.driver",readconfig.getFirefoxPath());               //readconfig.getchromepath());            //System.getProperty("user.dir")+"//Drivers//chromedriver.exe");     //readconfig.getchromepath());                            //System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        	driver=new FirefoxDriver();
    	}
    	
    	
    	driver.get("https://qdtas-hrm-front-end.vercel.app/");
    	
        driver.manage().window().maximize();
    	

    	//logger=Logger.getLogger("qdtas-hrm");
    	//PropertyConfigurator.configure("Log4j.Properties");
       //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //driver.get(baseURL);

}        
  



    @AfterClass
    public void tearDown()
    {
      driver.quit();	
    }
    
    
     public void FiledScreenshot(ITestResult result) throws IOException
     {
    	     if(ITestResult.FAILURE ==result.getStatus()) {
    		 Screenshot.getScreenshot(driver);
    		 }
    		 else if(ITestResult.SUCCESS==result.getStatus()){
    		 Screenshot.getScreenshot(driver);
    		 }
     }




	public void OnTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}




	public void OnTestSucess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}




	//public void OnTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	//}




	//public void OnFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	//}




	//public void OnTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	//}
     

 //	public String randomstring()
 //{
     // String generatedstring=RandomString.randomeAlphabetic(9);
      //return(generatedstring);
      
 //}
 	//public String randomNum()
 	//{
      //String generatedstring=RandomString.randomNumeric(4);
      //return(generatedstring);
      
 //}
    
   

       } 


 
 
    
