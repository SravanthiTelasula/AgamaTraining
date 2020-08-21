package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click(); 
		Select userRole = new Select(driver.findElement(By.xpath("//*[@id=\'searchSystemUser_userType\']")));
		userRole.selectByVisibleText("ESS");
		
		
		Select status = new Select(driver.findElement(By.xpath("//*[@id=\'searchSystemUser_status\']")));
		status.selectByIndex(2);
		status.selectByValue("1");
		
		//*[@id="searchSystemUser_status"]
		
		
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		System.out.println(driver.getTitle());
		//driver.close();
		//driver.quit();
		
		
	}

}
