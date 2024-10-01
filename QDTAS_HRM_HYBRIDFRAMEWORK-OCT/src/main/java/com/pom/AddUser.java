package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {

	@FindBy(name="userName") //Annotation
	private WebElement USERNAME1;  
	
	@FindBy(name="email")
	private WebElement EMAIL;
	
	@FindBy(name="firstName")
	private WebElement FIRSTNAME;
	
	@FindBy(name="middleName")
	private WebElement MIDDLENAME;
	
	@FindBy(name="lastname")
	private WebElement LASTNAME;
	
	@FindBy(id="dob")
	private WebElement DOB;
	
	@FindBy(id="password")
	private WebElement PASSWORD1;
	
	@FindBy(name="confirm_Password")
	private WebElement CONFIRM_PASSWORD;
	
	@FindBy(name="gender")
	private WebElement GENDER;
	
	@FindBy(id="phoneNumber")
	private WebElement PHONENUMBER;
	
	@FindBy(name="deptid")
	private WebElement DEPTID;
	
	@FindBy(name="role")
	private WebElement ROLE;
	
	@FindBy(name="designation")
	private WebElement DESIGNATION;
	
	@FindBy(name="submit")
	private WebElement SUBMIT;
	
	
	//private WebElement submitButton;
	

	
	

	public AddUser(WebDriver driver)
	{
	                                             
		PageFactory.initElements(driver, this);
	}
	
	
	public void userName(String userName)
    {
	        USERNAME1.sendKeys(userName);
    }
	
	public void email(String email)
    {
	        EMAIL.sendKeys(email);
    }
	
	public void firstname(String firstname)
    {
	        FIRSTNAME.sendKeys(firstname);
    }
	
	public void middleName(String middleName)
    {
	        MIDDLENAME.sendKeys(middleName);
    }
	
	
	public void lastname(String lastname)
    {
	        LASTNAME.sendKeys(lastname);
	        
    }
	
	public void dob(String dob)
    {
	        DOB.sendKeys(dob);
    }
	
	public void password(String password)
    {
	        PASSWORD1.sendKeys(password);
    }
	
	public void confirm_Password(String confirm_Password)
    {
	        CONFIRM_PASSWORD.sendKeys(confirm_Password);
    }
	
	public void gender(String gender)
    {
	        GENDER.sendKeys(gender);
    }
	
	public void phoneNumber(String phoneNumber)
    {
	        PHONENUMBER.sendKeys(phoneNumber);
    }
	
	public void deptid(String deptid)
    {
	        DEPTID.sendKeys(deptid);
    }
	
	public void role(String role)
    {
	       ROLE.sendKeys(role);
    }
	
	public void designation(String designation)
    {
	        DESIGNATION.sendKeys(designation);
    }
	
	public void submit()
    {
	       SUBMIT.click();
    }


	public static void clickAddUser() {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
	
	