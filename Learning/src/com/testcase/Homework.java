package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.ie.driver", "C:\\selenium_drivers\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
		//contains and text 
		driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
		
		//starts-with
		driver.findElement(By.xpath("//input[starts-with(@name,'assign')]")).sendKeys("sra");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
				
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();
		
		
		//contains
		//driver.findElement(By.xpath("//*[contains(@class,'butt')]")).click();
		
		
		
		
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("helllllll");
		
		//relative xpath       
	    //driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click(); 
		
		//starts-with
		//driver.findElement(By.xpath("//button[starts-with(@id,'u_0')]")).click(); 
		
		

	}

}
