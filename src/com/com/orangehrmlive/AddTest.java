package com.com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class AddTest {
  @Test
  public void Addtest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

	  ChromeDriver chrome = new ChromeDriver();

	  chrome.get("https://opensource-demo.orangehrmlive.com");

	  chrome.findElement(By.name("txtUsername")).sendKeys("linda.anderson");

	  chrome.findElement(By.name("txtPassword")).sendKeys("linda.anderson");

	  chrome.findElement(By.id("btnLogin")).click();
	  



	}

	  
	  
	  
	  
  }

