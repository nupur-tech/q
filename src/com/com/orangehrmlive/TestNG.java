package com.com.orangehrmlive;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNG {
  @Test
  public void test() throws InterruptedException, AWTException {

System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

ChromeDriver chrome = new ChromeDriver();

chrome.get("https://opensource-demo.orangehrmlive.com");

chrome.findElement(By.name("txtUsername")).sendKeys("Admin");

chrome.findElement(By.name("txtPassword")).sendKeys("admin123");

chrome.findElement(By.id("btnLogin")).click();

Thread.sleep(2000);
chrome.findElement(By.linkText("Admin")).click();
WebElement userdd = chrome.findElement(By.id("searchSystemUser_userType"));

Select userType = new Select(userdd);
userType.selectByIndex(1);
		
WebElement admin = chrome.findElement(By.linkText("Admin"));
Actions mouseHover = new Actions(chrome);
mouseHover.moveToElement(admin).build().perform();

WebElement job = chrome.findElement(By.linkText("Job"));
mouseHover.moveToElement(job).build().perform();

Robot r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_A);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_A);

Thread.sleep(2000);
chrome.findElement(By.id("welcome")).click();
Thread.sleep(2000);
chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();


  }
}
