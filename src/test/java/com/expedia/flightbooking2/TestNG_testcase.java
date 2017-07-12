package com.expedia.flightbooking2;

import java.util.concurrent.TimeUnit;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import AutomationFW.Searchpage;

public class TestNG_testcase {
    //private static final String PropertyConfigurator = null;
	private WebDriver driver;
	private String baseURL;
	 //static Logger log = Logger.getLogger(UsingLog4j.class);
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\Selenium Java\\geckodriver.exe");  
		driver = new FirefoxDriver();
		  baseURL = "https://www.expedia.com/";
		  System.out.println("url");
		  
		  //Maximize the browser's window
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			//PropertyConfigurator.configure("log4j.properties");

		
	  }  
	@Test
  public void testMethod() {
		System.out.println("into testmethod");
		driver.get(baseURL);
		driver.findElement(By.id("tab-package-tab-hp")).click();
		Searchpage.Origintextbox(driver).sendKeys("New York");
		Searchpage.Destinationtextbox(driver).sendKeys("Chicago");
		//Searchpage.Departuredatetextbox(driver).sendKeys("06/01/2017");
		//Searchpage.Returndatetextbox(driver).sendKeys("09/01/2017");
		  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
