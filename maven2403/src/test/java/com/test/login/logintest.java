package com.test.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class logintest {
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		System.setProperty("webdriver.gecko.driver", 
				"/home/arpita/Downloads/geckodriver-v0.21.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("a")).sendKeys("news");
		//Find user name and fill user name
	  
		//Assert.assertTrue(homeText.toLowerCase().contains("guru99 bank"));
	}
}
