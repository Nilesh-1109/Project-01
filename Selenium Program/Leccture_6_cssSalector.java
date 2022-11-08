package selenium_sep21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leccture_6_cssSalector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//cssSalector   
		// 1 tagname with id
		driver.findElement(By.cssSelector("input#email")).sendKeys("12345");
		
		// 2 tagname with class( here use . opretar and remove space)
		driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._9npi.inputtext._9npi")).sendKeys("123456");
		
		//3 tagname with other attribute (there is no need to remove space between class)
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
		
		
                driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		// 4 tagname with id and with other attribute
                Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#password_step_input[name='reg_passwd__']")).sendKeys("12345");
		
                driver.get("https://kite.zerodha.com/");
                Thread.sleep(3000);
        
                // 5 tagname with class and other attribute
                driver.findElement(By.cssSelector("button.button-orange.wide[type=submit]")).click();
		
		
	       //driver.findElements(by.)
		
		}

}
