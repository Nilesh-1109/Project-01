package selenium_sep21;
xzsaqpackage selenium_sep21;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_14_getwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[text()='Jobs']")).click();
		
	    String mainwindow = driver.getWindowHandle();
	    Set<String> childwindows = driver.getWindowHandles();
	    
	    Iterator<String> itr = childwindows.iterator();
	    while(itr.hasNext()) {
	    String childwindow = itr.next();
	    
	    if(!mainwindow.equalsIgnoreCase(childwindow)) {
	    	driver.switchTo().window(childwindow);
	    	System.out.println(driver.getTitle());
	    }
	    	
	    }
	    
	    
	    driver.switchTo().window(mainwindow);
	    System.out.println(driver.getTitle());
	    driver.quit();

			}
		
		
		
		
		
	}


