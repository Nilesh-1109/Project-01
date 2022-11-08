package selenium_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_22_Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
	    driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		
	  //2222  driver.switchTo().frame(2);
	    driver.switchTo().frame("frame1");
        WebElement frame =driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println(frame.getText());		

        driver.get("http://demo.guru99.com/test/guru99home/");
         


	}

}
