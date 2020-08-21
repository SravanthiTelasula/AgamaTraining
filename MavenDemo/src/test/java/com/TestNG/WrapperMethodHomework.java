package com.TestNG;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperMethodHomework {

	WebDriver driver;
	
	
	
	public void insertapp(String url)
	{
		WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get(url);
System.out.println("opened");
		}
	
	
	
	
public void enterbyid(String val,String name)
{
driver.findElement(By.id(val)).sendKeys(name);
	}
	



	public void enterbyxapth(String val2, String name2)
	{
		driver.findElement(By.xpath(val2)).sendKeys(name2);

	}
	
	
		
	public void clickbyxpath(String val1) {
		driver.findElement(By.xpath(val1)).click();
	}
	
	
	
	
	public void closeapp() {
		driver.close();
	}
	
	
	
	public void takesnap(String path) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
	       File source = ts.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(source,new File((path)));
	}
	
	
	
	
	public void selectdropdown(String text) {
	    Select month=new Select(driver.findElement(By.id("month")));
	    month.selectByVisibleText(text);
	}
	
	public void enterbyname(String val3, String name3) {
		driver.findElement(By.xpath(val3)).sendKeys(name3);
	 
	}

	public void enterkeyusingxpath1(String val4) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
	}

	public void windowhandling(String val4) {
		// TODO Auto-generated method stub
        Set<String>winhandles=driver.getWindowHandles();//all the windows
		
		System.out.println("the number of window are:"+winhandles.size());
		
		
		for(String winhandle:winhandles) {
			driver.switchTo().window(winhandle);
			
			//clickbypath();
			
		}
		String title=driver.getTitle();
		System.out.println("the page title is"+ title);


	}


	public void enterbyxpath() {
		// TODO Auto-generated method stub
		
	}




	public void enterkeyusingxpath(String val4) {
		// TODO Auto-generated method stub
		
	}
	
	public void login(String usrname, String password) throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys(usrname);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		  System.out.println("logged in");
		  Thread.sleep(2000);
	  }
	
	public void forgetpassword(String linktxt) throws InterruptedException {
		  driver.findElement(By.linkText("Forgot your password?")).click();
			
		  System.out.println("forget password");
		  Thread.sleep(2000);
	  }
	
	public void logout() {
		
		  System.out.println(" closed");
		  driver.close();
		 
		 
	  }
	
	
	  }
		 

