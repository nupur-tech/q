package com.com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriven {
ChromeDriver chrome;
	
@DataProvider(name="credentials")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
					{"Ad","admin"},
					{"linda.anderson","linda.anderson"}
				};
	}
  
	  @Parameters({"chkey"})
		@BeforeTest
	  public void openBrowser(String key) {
		  System.setProperty(key, "D:\\chromedriver.exe");
			 chrome = new ChromeDriver();
			chrome.get("https://opensource-demo.orangehrmlive.com/");
			
	  }
	  
	  @AfterTest
	  @Test(dataProvider="credentials")
	  public void loginTest(String un,String pwd) throws Exception
	  {
		  chrome.findElement(By.name("txtUsername")).sendKeys(un);
			chrome.findElement(By.name("txtPassword")).sendKeys(pwd);
			chrome.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
	  }
	  
	  @AfterTest
	  public void closeBrowser() throws InterruptedException
	  {
		  chrome.close();
		  Thread.sleep(4000);
	  }
}
