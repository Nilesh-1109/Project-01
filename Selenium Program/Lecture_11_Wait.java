	package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lecture_11_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Wait concepts
		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		  // implicit wait
	//	driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		      // explicit wait or Webdriver wait
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='firstname']"))).sendKeys("sachin");
		
	//	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("sachin");

		
	
	
	
	
	
	}

}
