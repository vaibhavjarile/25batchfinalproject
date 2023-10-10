package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	
	@Test
	
	public void capturingScreenShot() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/search?q=apache+common+io");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot screenShot=(TakesScreenshot)driver;
		
		File source=screenShot.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\Vaibh\\Desktop\\ScreenShot\\ss.png");
		
		FileUtils.copyFile(source,destination );
		
		System.out.println("screenshot....captured");
		
		driver.close();
		
	}

}
