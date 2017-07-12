package AutomationFW;

import static org.junit.Assert.*;
import AutomationFW.Searchpage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Pageobjectmodel {

	 private WebDriver driver;
	 private String baseURL;
	 
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\Selenium Java\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com";
		//maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() throws Exception {
		driver.get(baseURL);
		driver.findElement(By.id("header-history")).click();
		Thread.sleep(8000);
		//Searchpage.Origintextbox(driver).sendKeys("New York");
		//Searchpage.Destinationtextbox(driver).sendKeys("Chicago");
		//Searchpage.Departuredatetextbox(driver).sendKeys("06/12/2017");
		//Searchpage.Returndatetextbox(driver).sendKeys("09/01/2017");
		Searchpage.clickonsearchbutton(driver);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
}
