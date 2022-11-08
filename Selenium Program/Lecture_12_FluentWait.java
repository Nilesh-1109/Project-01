package selenium_sep21;



import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Lecture_12_FluentWait {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
			
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(9000,TimeUnit.MILLISECONDS);
			wait.pollingEvery(50, TimeUnit.MILLISECONDS);
			wait.ignoring(NoSuchElementException.class);
			
	        WebElement uname	=	(WebElement) wait.until(new Function<WebDriver, WebElement>() {
		
				public WebElement apply(WebDriver driver) {
					
					return driver.findElement(By.xpath("//*[@name='firstname']"));
				}
			});
	           uname.sendKeys("sachin");
			
		}
		
	}
		
		
		
	


