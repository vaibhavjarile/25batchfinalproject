package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotOrangeHrmSite {
	
	@Test
	
	public void OrangeHRMSS() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*File ScreenShot=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div")).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\Vaibh\\Desktop\\ScreenShot\\ss.png");
		
		FileUtils.copyFile(ScreenShot, Destination);
		
		System.out.println("screenshot..........capture");*/
		
		File ScreenShotOrange=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]")).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\Vaibh\\Desktop\\ScreenShot\\ss.png");
		
		FileUtils.copyFile(ScreenShotOrange, Destination);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
