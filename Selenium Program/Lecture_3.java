package selenium_sep21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String U = "https://www.facebook.com";
	//	there are 5 navigation commands in selenium
		
		driver.navigate().to(U);

 //	2   driver.navigate().to("https://kite.zerodha.com/");
		
//	3	driver.navigate().back();
//		
//	4	driver.navigate().forward();
//		 
//	5	driver.navigate().refresh();
		
		
	driver.findElement(By.xpath("//*[@id = 'email']")).sendKeys("1234");
	driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("1234");
	driver.findElement(By.name("login")).click();
	
		
	}

}
