package com.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Screenshot extends BaseClass{
	
	public static void getScreenshot(WebDriver driver) throws IOException {
		
		
		 File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 Date d1 = new Date();
		 String a = d1.toString();
		 System.out.println(a);
		 File d = new File(System.getProperty("user.dir")+"\\TestData\\pqr.bmp");
	     FileUtils.copyFile(s, d);


}
}
