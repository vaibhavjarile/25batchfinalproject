package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.AddToCartObject;
import resourceses.BaseClass;

public class AddToCartProduct extends BaseClass {
	
	@Test
	
	public void addtocart() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		driverInitialize();
		
		driver.get("https://www.amazon.com/?ref_=icp_country_from_in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		AddToCartObject obj=new AddToCartObject(driver);
		
		obj.MainSearch().click();
		Thread.sleep(3000);
		
		obj.Search().click();
		Thread.sleep(3000);
		
		obj.Accessories().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		obj.Tripod().click();
		Thread.sleep(3000);
		
		obj.TowardsCart().click();
		Thread.sleep(3000);
		
		obj.GoToCart().click();
		Thread.sleep(3000);
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\Vaibh\\Desktop\\ScreenShot\\ss.png");
		
		FileUtils.copyFile(source, destination);
		
		System.out.println("screenshot.........capture");
		
		obj.CheckOut().click();
		Thread.sleep(3000);
		
		System.out.println("Done with Proceed To Checkout ");
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
