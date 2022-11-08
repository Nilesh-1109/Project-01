package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Just_For_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
                          /*  Its not working it is showing following exception so i have to ask someone
                             *   Error: Could not find or load main class selenium_sep21.Just_For_practice
                             Caused by: java.lang.ClassNotFoundException: selenium_sep21.Just_For_practice   */
		
		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
	    
		 WebDriver driver = new ChromeDriver(); 
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com");
		
	}

}
