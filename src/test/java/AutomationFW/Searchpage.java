package AutomationFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.apache.log4j.Logger;


public class Searchpage {
	
	public static WebElement element=null;
	//static Logger log = Logger.getLogger(Searchpage.class);

	       
	public static WebElement Origintextbox(WebDriver driver){
		    element = driver.findElement(By.id("package-origin-hp-package"));
		    return element;		   	
	}
	public static WebElement Destinationtextbox(WebDriver driver){
	    element = driver.findElement(By.id("package-destination-hp-package"));
	    return element;		   }
	
	public static WebElement Departuredatetextbox(WebDriver driver){
	    element = driver.findElement(By.id("flight-departing"));
	    return element;		   }
	
	public static WebElement Returndatetextbox(WebDriver driver){
	    element = driver.findElement(By.id("flight-returning"));
	    return element;		   }
	
	public static WebElement searchbutton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
			}

    public static void clickonsearchbutton(WebDriver driver){
    	element = searchbutton(driver);
    	element.click();
    }
    //Navigate to flights tab
   // public static void navigateToflightsTab(WebDriver driver){
    	//driver.findElement(By.id("header-history")).click();
   // }
}
