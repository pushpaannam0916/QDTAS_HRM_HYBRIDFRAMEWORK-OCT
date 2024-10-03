package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class Projects {
	   WebDriver lDriver;
	   
	   
	   public Projects(WebDriver rdriver)
	   {
		  lDriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	   }
	   
	   @FindBy(name="project")
	   @CacheLookup
	   WebElement txtProject;
	   
	   @FindBy(name="client")
	   @CacheLookup
	   WebElement txtClient;
	   
	   @FindBy(name="descripition")
	   @CacheLookup
	   WebElement Descripition;
	   
	   @FindBy(name="teams")
	   @CacheLookup
	   WebElement txtTeams;
	   
	   @FindBy(name="selectmanagers")
	   @CacheLookup
	   WebElement txtSelectManagers;
	   
	   @FindBy(name="status")
	   @CacheLookup
	   WebElement txtStatus;
	   
	   @FindBy(name="type")
	   @CacheLookup
	   WebElement txtType;
	   
	   @FindBy(xpath="//*[@type='submit']")
	   @CacheLookup
	   WebElement submitButton;

	
	   public void setProjectName(String projectname)
       {
	        txtProject.sendKeys(projectname);
       }
     
        public void setProjectNameNull()
       {
    	 txtProject.click();
       }
  
      
			
		

	public void setDescripition(String descripition)
       {
	       Descripition.sendKeys(descripition);
        }
   
       public void setDescripitionNull()
      {
  	   Descripition.click();
       }
	   
       public void setClient(String client)
       {
	        txtClient.sendKeys(client);
        }
   
       public void setClientNull()
      {
  	   txtClient.click();
       }
       
	      
       public void setTeams(String teams)
       {
	        txtTeams.sendKeys(teams);
        }
   
       public void setTeamsNull()
      {
  	   txtTeams.click();
       }
       
	   
       public void setSelectManagers(String selectmanagers)
       {
	        txtSelectManagers.sendKeys(selectmanagers);
        }
   
       public void setSelectManagersNull()
      {
  	   txtSelectManagers.click();
       }
       
       public void setStatus(String status)
       {
	        txtStatus.sendKeys(status);
        }
   
       public void setStatusNull()
      {
  	   txtStatus.click();
       }
       
       public void setType(String type)
       {
	        txtType.sendKeys(type);
        }
   
       public void setTypeNull()
      {
  	   txtType.click();
       }
       
       public void clicksubmit()
       {
	   
    	   submitButton.click();
	   
   }

	public void clickProjects() {
		// TODO Auto-generated method stub
		
	}

	//public void clickprojects() {
		// TODO Auto-generated method stub
		
	}
     
	



