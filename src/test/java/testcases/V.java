package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class V {
	
	@Test
	
	public void LaunchTheUrl() throws InterruptedException
	{
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
	 WebDriver d=new ChromeDriver();
	 d.get("https://rahulshettyacademy.com/AutomationPractice/");
	 d.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 d.close();
	}

}
