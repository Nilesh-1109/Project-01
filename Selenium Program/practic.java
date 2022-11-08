package selenium_sep21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practic  {
	
public static void main (String[]args) {

	System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	/*driver.get("https://www.facebook.com");

	   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");*/
	
	}
}