package com.com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTest {
  @Test
  public void verifyTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

	  ChromeDriver chrome = new ChromeDriver();

	  chrome.get("https://opensource-demo.orangehrmlive.com");

	  chrome.findElement(By.name("txtUsername")).sendKeys("linda.anderson");

	  chrome.findElement(By.name("txtPassword")).sendKeys("linda.anderson");

	  chrome.findElement(By.id("btnLogin")).click();
	  
	  Thread.sleep(2000);
	  try
	  { 
		  WebElement error = chrome.findElement(By.id("spanMessage"));
		  if(error.isDisplayed() == true)
		  {
			  System.out.println("Invalid credentials");
		  }
	  }
	  catch(Exception e)
	  {
		  chrome.findElement(By.id("welcome")).click();
		  Thread.sleep(2000);
		  chrome.findElement(By.linkText("Logout")).click();
	  }

	  
  }
}
