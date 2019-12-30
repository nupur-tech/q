package com.com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Browser {
	  ChromeDriver chrome ;

  @Test(priority=1)
  public void openBrowser() {

	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  
	   chrome = new ChromeDriver();
	  
	  chrome.get("https://opensource-demo.orangehrmlive.com");
  }
	  
	  @Test(priority=2)
	  public void LoginTest() {
		  chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		  chrome.findElement(By.name("txtPassword")).sendKeys("admin123");

		  chrome.findElement(By.id("btnLogin")).click();

	  }
	  
	  @Test(priority=3)
	  public void adminTest() {
		  chrome.findElement(By.linkText("Admin")).click();
		  WebElement userdd = chrome.findElement(By.id("menu_admin_viewAdminModule"));

	  }
	  
	  @Test(priority=4)
	  public void pimTest() {
		  chrome.findElement(By.linkText("PIM")).click();
		  WebElement userdd = chrome.findElement(By.id("menu_pim_viewPimModule"));

	  }
	 
	  @Test(priority=5)
	  public void aboutTest()  {
		  chrome.findElement(By.id("welcome")).click();
		  //Thread.sleep(2000);
		  chrome.findElement(By.xpath("//*[@id=\"aboutDisplayLink\"]")).click();
  }
	  
	/*  @Test(priority=6)
	  public void aboutClose()  {
		  chrome.close(about);
		// chrome.findElement(By.id("welcome")).click();
		  //Thread.sleep(2000);
		  chrome.findElement(By.xpath("//*[@id=\"displayAbout\"]/div/a")).click();
  }*/
	  
	  @Test(priority=7)
	  public void logoutTest() throws InterruptedException {
		  chrome.findElement(By.id("welcome")).click();
		 Thread.sleep(2000);
		  chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	  }
}