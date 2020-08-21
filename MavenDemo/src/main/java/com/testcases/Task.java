package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/flights/");
			
			
			//From
		WebElement fromcity = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
		fromcity.sendKeys("mumbai");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		//to
		WebElement tocity = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		tocity.sendKeys("bangaluru");
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		//for notification
		WebElement notification = driver.findElement(By.xpath("//*[@id=\'SW\']/div[1]/div[1]/ul/li[6]/div[3]"));
		if(notification.isDisplayed())
		{
		driver.findElement(By.xpath("//*[@id=\'SW\']/div[1]/div[1]/ul/li[6]")).click();
		}
		//Departure date
		 driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();
		 
		 //select date
		 
		 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[6]/div")).click();
		 
		 //return date
		 driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[4]/div/label/span")).click();
		
		 //side arrow in date to change month
		 driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		
		 //select return date
		 driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[2]/div")).click();
		
		 //select/click search
		 driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/p/a")).click();
		 
		 //trying to print price in ascending order 
		/* List<WebElement> priceacending = driver.findElements(By.className("actual-price"));

	        System.out.println(priceacending.size());
	  
	       
	        for (WebElement webElement : priceacending) {
	            String price = webElement.getText();
	           // price.substring(2);
	            System.out.println(price);
	             }  */
		 
		 //click sort by price drop down arrow
		// driver.findElement(By.xpath("//*[@id='sorter_btn_onward']/i")).click();
		// Thread.sleep(2000);
		
		 //click on price low to high
		// driver.findElement(By.xpath("//*[@id=\'left-side--wrapper\']/div/div/div[1]/div[1]/div/div[2]/ul/li[1]/a/p")).click();
		
		 //click on book now button
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Book Now']")).click();
		 
		 //takescreenshot
		 Thread.sleep(2000);
			TakesScreenshot ts =(TakesScreenshot)driver;
		       File source = ts.getScreenshotAs(OutputType.FILE);
		       FileUtils.copyFile(source,new File(("src/test/resources/ScreenShot/ticket.png")));
			
		                               
		
		/*1.Launch the website - https://www.makemytrip.com/
		       2.Click on “Flights”
		       3.Choose From and To Values
		       4.Select the Travel date
		       5.Click Search
		       6.Print the “Price” values in ascending order
		       7.Choose the lowest fare bus and capture screenshot
		       8.Click “Select seats” button and put explicit wait.
		       9.Click the required seat
		       10.Click “Book Seat”
		       11.Assert the From and To Value
		       12.Close the browser*/ 
		//System.out.println(booknow.getText()); 
		
	     //booknow.click();
	
	}
	

}

	
