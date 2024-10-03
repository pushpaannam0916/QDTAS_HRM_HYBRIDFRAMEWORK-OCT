package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timesheet {
	 WebDriver lDriver;
	   
	   
	   public Timesheet(WebDriver rdriver)
	   {
		  lDriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	   }
	   
	   @FindBy(name="startTime")
	   @CacheLookup
	   WebElement txtstartTime;
	   
	   @FindBy(name="endTime")
	   @CacheLookup
	   WebElement txtendTime;
	   
	   @FindBy(name="date")
	   @CacheLookup
	   WebElement txtdate;
	   
	   
	   @FindBy(name="project")
	   @CacheLookup
	   WebElement txtproject;
	   
	   
	   @FindBy(name="note")
	   @CacheLookup
	   WebElement txtnote;
	   
	   @FindBy(name="reset")
	   @CacheLookup
	   WebElement txtreset;
	   
	   @FindBy(name="submit")
	   @CacheLookup
	   WebElement txtsubmit;



public void setStartTime(String startTime)
{
	txtstartTime.sendKeys(startTime);
}

 public void setStartTimeNull()
{
	 txtstartTime.click();
}
 
 public void setEndTime(String endTime)
 {
 	txtendTime.sendKeys(endTime);
 }

  public void setEndTimeNull()
 {
 	 txtendTime.click();
 }
  
  
  public void setDate(String Date)
  {
  	txtdate.sendKeys(Date);
  }

   public void setDateNull1()
  {
  	 txtdate.click();
  }
 
   
  
  
    public void setProject(String Project)
    {
    	txtproject.sendKeys(Project);
    }

     public void setProjectNull()
    {
    	txtproject.click();
    }
  
     
     public void setNote(String Note)
     {
     	txtnote.sendKeys(Note);
     }

      public void setNoteNull()
     {
     	txtnote.click();
     }
      public void clickreset()
      {
	   
   	   txtreset.click();
	   
  }
      
      public void clickreset1()
      {
	   
   	   txtreset.click();
	   
  }

	public void clickTimesheet() {
		// TODO Auto-generated method stub
		
	}
}

 
