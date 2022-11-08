package selenium_sep21;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoSwitchToSpecifiedWindow {
      

	public static WebDriver driver;
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
	    System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.findElement(By.xpath("//*[@alt='OrangeHRM on Facebook']")).click();
        driver.findElement(By.xpath("//*[@alt='OrangeHRM on twitter']")).click();
        driver.findElement(By.xpath("//*[@alt='OrangeHRM on youtube']")).click();
        driver.findElement(By.xpath("//*[@alt='LinkedIn OrangeHRM group']")).click();
        SwitchtoWindow(4);
        
        
        }
	    
	    public static void  SwitchtoWindow(int index) {
	    	
	    String windId = null;
	    
	    Set<String> set= driver.getWindowHandles();
	    Iterator<String> itr = set.iterator();
	    for(int i = 0 ; i<=index;i++) {
	    windId = itr .next();	  
	  }
	    driver.switchTo().window(windId);
	    System.out.println("window titile is  "+driver.switchTo().window(windId).getTitle());
	    	
	    	
	    }
        




}
