package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication {

	@Test
	public void actionOn() {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//with user name:admin and password:admin 
			//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			
			//without user and password
			driver.get("http://the-internet.herokuapp.com/basic_auth");
}
}