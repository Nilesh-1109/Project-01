package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.get("https://facebook.com");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ajitchalwade");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("meandi");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
	}

}
