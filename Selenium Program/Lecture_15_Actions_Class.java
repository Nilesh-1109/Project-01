package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lecture_15_Actions_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		// move to element
     	WebElement jobtag =driver.findElement(By.xpath("//div[(@class='mTxt') and (text()='Jobs')]"));
	    action.moveToElement(jobtag).perform();	
	    driver.findElement(By.xpath("//a[text()='IT jobs']")).click();
       
         
	    driver.get("https://demoqa.com/droppable");
	   
	    WebElement drag = driver.findElement(By.xpath("//*[text()='Drag me']"));
	    WebElement drop = driver.findElement(By.xpath("//*[text()='Drag me']//following-sibling::div"));
	    
	    Actions acton = new Actions(driver);
	    
	    acton.dragAndDrop(drag, drop).build().perform();
	}

}
