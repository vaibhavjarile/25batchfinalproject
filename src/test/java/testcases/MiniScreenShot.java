package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiniScreenShot {
	
	@Test
	
	public void pageScreenShot() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		File screenshot=driver.findElement(By.xpath("//*[@id=\"wrapper\"]")).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\Vaibh\\Desktop\\ScreenShot\\ss.png");
		
		FileUtils.copyFile(screenshot, Destination);
		
		driver.close();
		
	}

}
