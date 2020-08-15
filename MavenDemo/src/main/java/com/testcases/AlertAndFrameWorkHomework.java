package com.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAndFrameWorkHomework {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		

		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/javascript_alerts");
			
			//simple alert
			          //driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/button")).click();
			
			 //for prompt alert
                     // driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[2]/button")).click();
            
            //confirmation alert
			         driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[3]/button")).click();
         
			
			Alert alert = driver.switchTo().alert();	
 		    System.out.println(alert.getText());
 		    Thread.sleep(3000);
			
		
	
		   
		    // for simple alert 
		                 //alert.accept();
		    
		    //for prompt alert
		               // alert.dismiss();
 		    
 		   //confirmation alert
			           alert.sendKeys("test");
 		             Thread.sleep(1000);
 		             driver.switchTo().alert().accept();
			
			
	//FRAME HANDELING
			
			//driver.get("https://jqueryui.com/draggable/");
			//driver.findElement(By.linkText("Accordion")).click();
			//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			// System.out.println(driver.findElement(By.xpath("/html/body/div/h3[3]")).isDisplayed());
			// driver.findElement(By.xpath("/html/body/div/h3[3]")).click();
			 //driver.switchTo().defaultContent();
			// driver.findElement(By.linkText("Button")).click();
 		            
		                 
		                 
		                 
		                 
		                 
		           
		    
			

	}

}
