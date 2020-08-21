package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rough {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flight/search?itinerary=BOM-BLR-28/08/2020_BLR-BOM-12/10/2020&tripType=R&paxType=A-1_C-0_I-0&intl=false&cabinClass=E");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[4]/div/div[1]/div/div/div[3]/div[2]/button"));
		driver.findElement(By.xpath("//*[text()='Book Now']")).click();
		
		Thread.sleep(2000);
		TakesScreenshot ts =(TakesScreenshot)driver;
	       File source = ts.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(source,new File(("src/test/resources/ScreenShot/ticket.png")));
		
		
		//driver.findElement(By.xpath("//button[starts-with(@id,'bookbutton-RKEY')]")).click();
		//logging
		/*
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		//logout
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\'welcome-menu\']/ul/li[2]/a")).click();
		*/
		
		//forget password
		// driver.findElement(By.linkText("Forgot your password?")).click();
			
		  //System.out.println("forget password");
		

	}

}
