package com.TestMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestClass2 {
 
  @BeforeMethod(groups= {"sanity", "smoke"})
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD");
  }

  @AfterMethod(groups= {"sanity", "smoke"})
  public void afterMethod() {
	  System.out.println("AFTER METHOD");
  }

  @BeforeClass(groups= {"sanity", "smoke"})
  public void beforeClass() {
	  System.out.println("BEFORE CLASS");
  }

  @AfterClass(groups= {"sanity", "smoke"})
  public void afterClass() {
	  System.out.println("AFTER CLASS");
  }

  @BeforeTest(groups= {"sanity", "smoke"})
  public void beforeTest() {
	  System.out.println("BEFORE TEST");
  }

  @AfterTest(groups= {"sanity", "smoke"})
  public void afterTest() {
	  System.out.println("AFTER TEST");
  }

}
