package com.mycompany.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_4_webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String U = "https://kite.zerodha.com/";
		driver.navigate().to(U);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
     	WebElement   userid =     driver.findElement(By.xpath("//input[starts-with(@id,'userid')]"));
     	WebElement passw = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
     	WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		
		userid.sendKeys("OR3755");
		passw.sendKeys("5438");
		login.click();
		
		
		
		
		
		
		
		
	}
	
	

}
