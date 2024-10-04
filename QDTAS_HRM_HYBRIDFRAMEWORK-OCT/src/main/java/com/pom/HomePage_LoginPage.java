package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_LoginPage {
      

	@FindBy(name="email")    //Annotation
	private WebElement Email;  //Encapsulation
	
	@FindBy(name="password")
	private WebElement PASSWORD;
	
	@FindBy(name="submit")
	private WebElement SUBMIT;
	

	public HomePage_LoginPage(WebDriver driver)    //CONSTRUCTOR      INITIALIZATION    
	{
	                                             
		PageFactory.initElements(driver, this);
	}
	
//	public void ClickOnEmailTab() {
//		Email.sendKeys("admin@gmail.com");
//		
//	}
//	
//	public void ClickOnPasswordTab() {
//		PASSWORD.sendKeys("123@Admin");
//		
//	}
//	
//	public void clickOnSubmitTab() {
//		SUBMIT.click();
//	}
//}

	
	
	
public void  user(String user)
   {
		Email.sendKeys(user);
   }
  
	public void password(String password)
    {
	     //PASSWORD.sendKeys(password);
    }
   
 

    public void submit()
    {
	   
 	  SUBMIT.click();
	   
    }

	public void setEmail1(String email2) {
		// TODO Auto-generated method stub
		
	}
}

	//public void username(String user) {
		// TODO Auto-generated method stub
		
	//}


	




 
	

