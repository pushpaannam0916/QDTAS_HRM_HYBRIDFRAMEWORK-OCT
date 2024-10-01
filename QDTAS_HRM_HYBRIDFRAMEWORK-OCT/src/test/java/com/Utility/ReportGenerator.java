package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGenerator {
           public static ExtentReports extent;
           public static ExtentReports getExtentReport() {
        	   
        	   String Path = "C:\\Users\\sures\\eclipse-workspace\\QDTAS_HRM_HYBRIDFRAMEWORK\\TestReport\\index.html";
        	   ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
        	   reporter.config().setDocumentTitle("TestExecution Report");
        	   reporter.config().setReportName("Automation Report");
        	   reporter.config().setTheme(Theme.STANDARD);
        	   		
        	   extent = new ExtentReports();
        	   extent.attachReporter(reporter);
        	   extent.setSystemInfo("Host name", "localhost");
        	   extent.setSystemInfo("Environment", "Stage");
        	   extent.setSystemInfo("User", "Tester");
        	   extent.setSystemInfo("Browser", "Chrome");
        	   extent.setSystemInfo("OS","Windows11");
        	   return extent;
        	   
        		        

           }
}
