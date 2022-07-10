package com.TestMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestClass3{
	
public static WebDriver driver;

  @Test(groups = "sanity")
  public void test11() {
	  System.out.println("Test_Eleven");
  }
  @BeforeMethod
  public static void setup() throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	 
  }
  
  @AfterMethod
  public static void closeApp()
  {
	  driver.close();
  }
}
