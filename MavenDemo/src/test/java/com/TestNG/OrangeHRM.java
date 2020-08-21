package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	
	public class PriorityTestCase {
		WebDriver driver;
		@BeforeMethod
		public void launchapp() {
			  WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		@AfterMethod
		public void closeapp() {
			driver.close();
			
		}
		
		
		@Test
		public void login() {
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
		}
		
}
}