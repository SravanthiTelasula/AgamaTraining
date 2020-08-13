package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedbusHomework {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("che");
		//Thread.sleep(3000);
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.DOWN).perform();
		//action.sendKeys(Keys.DOWN).perform();
		//action.sendKeys(Keys.DOWN).perform();
		//action.sendKeys(Keys.ENTER).perform();
		
		
		
		//action.sendKeys(Keys.ARROW_DOWN);
		//action.sendKeys(Keys.ARROW_DOWN);
		//action.sendKeys(Keys.DOWN);
	    //action.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("che");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[2]")).click();
		
		
		
		
		
		
	}

}
