package selenium_sep21;

import org.openqa.selenium.By;

public class DataForAllprogram {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
	    driver  = new ChromeDriver();
	
		System.setProperty("webdriver.edge.driver","D:\\All driver\\msedgedriver\\msedgedriver.exe");
    	driver = new EdgeDriver();
	
         	driver.get("https://www.facebook.com");
	       driver.get("https://kite.zerodha.com");
	       driver.get("https://www.naukri.com/");

	   	driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
	       driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
	  
	
	  driver.findElement(By.xpath("//*[@title='Ad.Plus Advertising']")).click();
	   "Kite - Zerodha's fast and elegant flagship trading platform"
	
    	kite login
	    driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("1234567");
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123451234");
	    driver.findElement(By.xpath("//*[@class='button-orange wide']")).click();
	
	    fb login
     	driver.get("https://www.facebook.com");
    	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
	    driver.findElement(By.xpath("//*[@name='login']")).click();
	
	}

}
