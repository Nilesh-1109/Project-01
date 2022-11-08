package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_7_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com");
		driver.findElement(By.xpath("//input[@id = 'userid']")).sendKeys("OR3753");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("5438");
		driver.findElement(By.xpath("//button[@class = 'button-orange wide']")).click();
		
		
	}

}
