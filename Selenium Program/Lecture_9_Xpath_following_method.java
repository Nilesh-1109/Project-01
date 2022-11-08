package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_9_Xpath_following_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
                // and or method
	        WebElement cname = driver.findElement(By.xpath("//*[text()='Employees'  and (@label)]/ancestor-or-self::div[@class='fields-wrapper clearfix']/descendant::div[@class='field'][1]/child::input"));
		cname.sendKeys("mphasis");
	}
}
