package selenium_sep21;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lecture_16_Keyboard_Actons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
		
		Actions action = new Actions(driver);
		
		WebElement name = driver.findElement(By.xpath("//*[@id='userName']"));
		WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
		WebElement  currentad = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		WebElement padd = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
		WebElement submitbut = driver.findElement(By.xpath("//*[text()='Submit']"));
		driver.findElement(By.xpath("//*[@title='Ad.Plus Advertising']")).click();
		WebElement link =driver.findElement(By.xpath("//*[contains(text(),'Dynamic Properties')]"));
		
		action.sendKeys(name,"Sachin Munde").build().perform();
		action.sendKeys(email,"mundesachin11@gamil.com").build().perform();
		action.sendKeys(currentad,"A/P- Lokhandi Sawargaon Tal- Ambajogai Dist-Beed ,431517").build().perform();
		action.keyDown(currentad,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(padd,Keys.CONTROL).sendKeys("v").build().perform();
		action.moveToElement(link).build().perform();
		
		action.click(submitbut).build().perform();
		
		
	}

}
