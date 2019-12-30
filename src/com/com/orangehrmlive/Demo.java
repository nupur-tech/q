package com.com.orangehrmlive;

import org.testng.annotations.Test;

public class Demo {
  @Test(priority =2)
  public void demo() {
	  System.out.println("Hello1");
  }
  
  @Test(priority =1)
  public void demo1() {
	  System.out.println("hey");
  }
}
