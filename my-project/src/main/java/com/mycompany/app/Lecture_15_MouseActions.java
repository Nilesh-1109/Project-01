package com.mycompany.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lecture_15_MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// mouse actions click right click double click
		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
	    driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
	    Actions actions = new Actions(driver);
	
	    WebElement dclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		WebElement clik = driver.findElement(By.xpath("//button[text()='Click Me']"));
		WebElement ritclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	
		actions.doubleClick(dclick).perform();
		actions.click(clik).perform();
		actions.contextClick(ritclick).perform();
		
		// drag and drop 
		
		driver.get("https://demoqa.com/droppable");
        WebElement drag =driver.findElement(By.xpath("//div[text()='Drag me']"));
        WebElement drop =driver.findElement(By.xpath("//div[text()='Drag me']//following-sibling::div[@id='droppable']"));
		actions.dragAndDrop(drag, drop).perform();
		
		// mouse hover
		driver.get("https://demoqa.com/tool-tips");
		
		Thread.sleep(4000);
		WebElement hover =  driver.findElement(By.xpath("//button[text()='Hover me to see']"));
		actions.moveToElement(hover).perform();
//		System.out.println(hover.getText(""));
		
		
		
	}

}
