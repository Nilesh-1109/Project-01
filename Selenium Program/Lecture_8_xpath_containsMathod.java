package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_8_xpath_containsMathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		//contains method
		driver.findElement(By.xpath("//*[contains(@id,'user')]")).sendKeys("OR3753");
		
		//starts with method
		driver.findElement(By.xpath("//*[starts-with(@id,'pass')]")).sendKeys("1234");
		
		// text() method
	        //driver.findElement(By.xpath("//*[text()='Forgot user ID or password?']")).click();
		
		// contain text()
		driver.findElement(By.xpath("//*[contains(text(),'F')]")).click();
		
	}
}
