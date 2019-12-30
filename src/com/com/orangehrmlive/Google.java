package com.com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Google {
	ChromeDriver chrome ;

@Test(priority=1)
public void openBrowser() {

	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 chrome = new ChromeDriver();
	 //chrome.manage().window().maximize();
  
	 chrome.get("https://accounts.google.com/SignUp");
  }

	 
 @Test(priority=2)
  public void LoginTest() {
	 chrome.findElement(By.id("firstName")).sendKeys("Selenium");
	 chrome.findElement(By.id("lastName")).sendKeys("group027");
	 chrome.findElement(By.id("username")).sendKeys("group027");
	 chrome.findElement(By.name("Passwd")).sendKeys("DemoPassword");
	 chrome.findElement(By.name("ConfirmPasswd")).sendKeys("DemoPassword");

  }
}