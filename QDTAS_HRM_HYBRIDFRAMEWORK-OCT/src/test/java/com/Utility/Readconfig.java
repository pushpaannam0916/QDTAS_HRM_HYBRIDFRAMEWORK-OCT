package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public  class Readconfig{
	
     Properties pro;
	
	
     
	public Readconfig()
	{
		
	
File src = new File("./Configuration/config.Properities");
	   		
     try
	   {
 	   FileInputStream fis = new FileInputStream (src);
 	   pro = new Properties();
 	   pro.load(fis);
 	   
	   }
	  catch (Exception e)
	    {                                                                     
		System.out.println("Execption is " + e.getMessage());
		
	    }
	   
	   }
	public String getApplicationURL()
	   {
		   String URL=pro.getProperty("baseURL");
		   return URL;
	   }
	public String getEmail()
	   {
		   String email=pro.getProperty("email");
		   return email;
	   }
	   public String getPassword()
	   {
		   String password=pro.getProperty("password");
		   return password;
	   }
	   public String getChromePath()
	   {
		   String chromepath=pro.getProperty("chromepath");
		   return chromepath;
	   }  
	   
	   public String getFirefoxPath()
	   {
		   String firefoxpath=pro.getProperty("firefoxpath");
		   return firefoxpath;
	   }  
	   
}   



