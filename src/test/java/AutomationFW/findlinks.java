package AutomationFW;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class findlinks {

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
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		List<WebElement> linksList = clickableLinks(driver);
		for (WebElement link : linksList){
			
			String href = link.getAttribute("href");
			try {
				System.out.println("URL" + href + "returned" + linkStatus(new URL(href)));
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
					
		}
			}
	
   public static List<WebElement> clickableLinks(WebDriver driver){
	   List<WebElement>  linksToclick = new ArrayList<WebElement>();
	   List<WebElement>  elements = driver.findElements(By.tagName("a"));
	   elements.addAll(driver.findElements(By.tagName("img")));
	   
	   for (WebElement e : elements) {
		   if (e.getAttribute("href") != null){
			   linksToclick.add(e);
			    }
		   	  }
	   return linksToclick;
	   
	   
	   
   }
   
   public static String linkStatus(URL url){
	try {
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.connect();
		String responseMessage = http.getResponseMessage();
		http.disconnect();
		return responseMessage;
	}
	catch (Exception e){
		return e.getMessage();
	}
   }
	@After
	public void tearDown() throws Exception {
	}
	

}
