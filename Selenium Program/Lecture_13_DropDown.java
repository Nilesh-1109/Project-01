package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lecture_13_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@title='Ad.Plus Advertising']")).click();
		driver.findElement(By.xpath("//*[text()='Select Option']")).click();
		driver.findElement(By.xpath("//*[text()='Group 1, option 1']")).click();
		driver.findElement(By.xpath("//*[text()='Select Title']")).click();
		driver.findElement(By.xpath("//*[text()='Dr.']")).click();
		
	
		WebElement oldmenu =  driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
		
		Select color = new Select(oldmenu);
		color.selectByVisibleText("Purple");
		
		
     driver.findElement(By.xpath("//*[text()='Select...']")).click();
     driver.findElement(By.xpath("//div[text()='Black']")).click();
     driver.findElement(By.xpath(" //div[text()='Blue']")).click();
  
     WebElement cars = driver.findElement(By.xpath("//*[@name='cars']"));
     
     Select brand = new Select(cars);
     brand.selectByIndex(0);
		
  
		
		
		
	}

}
