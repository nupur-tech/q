package com.com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class verizon {
	  ChromeDriver chrome ;

  @Test(priority=1)
  public void openBrowser() {

	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
  }
	  
  @Test(priority=2)
  public void mouse() {
	  Actions act = new Actions(chrome);
      act.moveToElement(chrome.findElement(By.id("gnavAccountMenu"))).build().perform();
	 
  } 
}