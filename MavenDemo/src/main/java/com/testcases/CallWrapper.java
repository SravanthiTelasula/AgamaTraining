package com.testcases;

import java.io.IOException;

public class CallWrapper {
	
	public static void main(String[] args) throws IOException  {
		  WrapperMethod wm = new WrapperMethod();
		//  wm.insertapp("https://www.facebook.com");
		 // wm.enterbyid("email", "joshij@gmail.com");
		//  wm.enterbyid("pass", "xxxxxx");
		//  wm.clickbyxpath("//*[@id=\'u_0_f\']");
		//  wm.takesnap("E:\\takescreen\\file1.png");
		//  wm.closeapp();
		  
		  
		  
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		  wm.enterbyid("txtUsername", "Admin");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyxpath("//*[@id=\'btnLogin\']");
		  wm.takesnap("src/test/resources/ScreenShot/file1.png");
		  wm.closeapp();
			}
	


}
