package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("helllllll");
		
		//relative xpath       
	
		//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click(); 
		
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
		//link text
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//partial link text
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		//and condition
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")).sendKeys("training");
		//or condition  **************************try this
		driver.findElement(By.xpath("//input[@aria-label='Last name' or @name='lastname']")).sendKeys("traininglast");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("777777777");
		

	
		
	
		

	}

}
