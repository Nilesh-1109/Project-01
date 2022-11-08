package selenium_sep21;
5yh npackage selenium_sep21;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture19_howToCaptureScreenShot {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\All driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File srcfile = 	ts.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(srcfile,new File("C:\\Users\\User\\Desktop\\siddharth school video\\abc.jpeg"));
//	FileUtils.copyFile(srcfile,new File("C:\\Users\\User\\eclipse-workspace\\Selenuim_java_sep2021\\ab.jpeg"+timestamp()+".jpeg"));

//}
//	private static String timestamp() {
//		// TODO Auto-generated method stub
//		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
//	
	   }
}