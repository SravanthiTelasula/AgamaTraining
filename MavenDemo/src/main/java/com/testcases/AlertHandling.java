package com.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	        driver.get("http://demo.guru99.com/test/delete_customer.php");
	        driver.findElement(By.name("submit")).click();
	        Alert alert = driver.switchTo().alert();	
		    System.out.println(alert.getText());
		    Thread.sleep(3000);
		   // alert.accept();
		    alert.dismiss();
		   // alert.sendKeys("test");

	}

}
