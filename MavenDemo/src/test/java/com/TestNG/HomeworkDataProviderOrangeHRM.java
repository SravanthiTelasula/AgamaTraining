package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeworkDataProviderOrangeHRM {
	
WebDriver driver;
	
	@Test(dataProvider="facebooklogin")
	public void loginTofacebook(String username,String password) throws Exception {
		WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();       
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.id("email")).sendKeys(username);
	//driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	
	driver.findElement(By.name("Submit")).click();
	/*
	 * Assert.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
	 * System.out.println(driver.getCurrentUrl());
	 * System.out.println("User is able to login sucessfully");
	 */
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

	@DataProvider(name="facebooklogin")
	public Object[][] passData() {

	Object[][] data=new Object[3][2];
	 		//username
			data[0][0]="Admin";
			//password
			data[0][1]="admin123";

			data[1][0]="joshi";
			data[1][1]="demo123";

			data[2][0]="sathya";
			data[2][1]="demo1234";

			return data;
		}


}
