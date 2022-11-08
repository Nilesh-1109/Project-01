package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_20_Stale_ref_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
	  WebDriver  driver  = new ChromeDriver();
	      driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		 	driver.get("http://demo.automationtesting.in/Register.html");
		 	
		 WebElement name = 	driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]"));
		 	name.sendKeys("Sachin");
		 	System.out.println("name enterd successfully");
		 	driver.navigate().refresh();
		 	
		 	
		  try {
				 WebElement name1 = 	driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]"));
			     name1.sendKeys("Sachin"); 
		}
		  
		  catch (StaleElementReferenceException e ) {
		          System.out.println(e.getMessage());
		
		}
		 	    System.out.println("renterd name succefully");
	}

}
