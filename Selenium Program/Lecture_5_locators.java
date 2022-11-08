package selenium_sep21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_5_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	
		//id
		driver.findElement(By.id("email")).sendKeys("12334");
		
		//name
		driver.findElement(By.name("pass")).sendKeys("1234456");
	//	driver.findElement(By.xpath("//button[@value='1']")).click();
		
		//linktext()
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partiallinktext()
	       //driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//tagname
             // List<WebElement>divtag =driver.findElements(By.tagName("div"));	
            //  System.out.println(divtag.size());
		
	        List<WebElement>image =driver.findElements(By.tagName("img"));
		System.out.println("no of image"+image.size());
		
		// with the help of this method you can calculate the no image , frame, table , tags on the web page
	
	}
}
