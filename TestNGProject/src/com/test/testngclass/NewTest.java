package com.test.testngclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
	public void a() {
 System.out.println("pankya");
  
  }
	
  
  
	@Test
  public void f() {
	  System.out.println("i am test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am before method");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am after method");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am before class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am afterclass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am before test");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am after test");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am before suite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am  after suite");

  }

}
