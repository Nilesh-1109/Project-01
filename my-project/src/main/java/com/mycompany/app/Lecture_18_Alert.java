package com.mycompany.app;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_18_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tr[2]//td[2]//input")).sendKeys("123");
		driver.findElement(By.xpath("//tr[3]//td[2]//input[1]")).click();
		
	//   driver.switchTo().alert().dismiss();
		
	   System.out.println(driver.switchTo().alert().getText());
		
		
		
		
		
		
		
		
	}

}
