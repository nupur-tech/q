package com.com.orangehrmlive;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkart {
	ChromeDriver chrome;
	@Test(priority = 1)
	  public void openBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  chrome = new ChromeDriver();
		  chrome.get("https://www.flipkart.com/");
	 }
	@Test(priority = 2)
	  public void Remove()
	  {
		chrome.findElementByXPath("/html/body/div[2]/div/div/button").click();
	  }
	@Test(priority = 3)
	  public void Search()
	  {
		chrome.findElementByName("q").click();
		chrome.findElementByName("q").sendKeys("laptop");
		chrome.findElementByName("q").sendKeys(Keys.ENTER);
		
	  }
	public void AddToCart()
	{
		 
		chrome.findElementById("en_SYB+9gOHGvwcgLrRuCWSR5F8U1ZE+ITQbZDPcYkI7omAEfAPgm59vWQBx+yQiNb7DuCaFRJd9sYHFFzT4EjPdw==").click();
	}
}
