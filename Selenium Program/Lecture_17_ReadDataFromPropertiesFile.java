package selenium_sep21;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_17_ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Selenuim_java_sep2021\\DATA.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		driver.get(prop.getProperty("url2"));
		driver.findElement(By.xpath("//input[contains(@id,'userid')]")).sendKeys(prop.getProperty("Uname"));
		
		
		
		
		
	}

}
