package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testcases.WrapperMethod;

public class CallwrapperHomework {

	WrapperMethodHomework wm;
	
		@BeforeMethod
		public void launchapp() {
		    wm = new WrapperMethodHomework();
		    wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		}
		
		@Test
		  public void login() throws InterruptedException {
			
			wm.login("Admin", "admin123");
			
		  }
	

		 @Test
		  public void forgetpassword() throws InterruptedException {
			 wm.forgetpassword("Forgot your password?");
		 }

		 @AfterMethod
		  public void logout() {
			 wm.logout();
			 //use AfterTest if u dont want to close browser after every test
			 
		  }
















}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	



