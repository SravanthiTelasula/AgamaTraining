package com.TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testcases.WrapperMethod;

public class FlipCart {
	WrapperMethod wm;
	
	@BeforeMethod
	public void launchapp() {
	    wm = new WrapperMethod();
	    wm.insertapp("https://www.flipkart.com/");
	}
	
	@Test
	public void search() {
		//driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).click();
	   wm.enterbyname("q","mobile");
	  wm.enterkeyusingxpath("//button[@class=\'vh79eN\']");
	   //wm.clickbyxpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg");
	
	}
	
	
	@Test(dependsOnMethods = "search")
	public void selectProduct() {
		//wm.clickbyxpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	
	}
	
	
	@Test(dependsOnMethods = "selectProduct")
	public void addProduct() {
		wm.windowhandling("//button[@class =\'_2AkmmA_2Npkh4_2MWPVK\']");
	
	}
	
	/*Launch the website - https://www.flipkart.com/
		2.Search any product and put implicit wait
		3.Add the product to the cart
		4.Assert the product name
		5.Assert the product price
		6.Close the browser*/
}
