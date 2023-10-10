package testcases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPageObject;
import resourceses.BaseClass;

public class VerifySignupPage extends BaseClass {
	
	@Test
	
	public void signuppage() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		driverInitialize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		SignUpPageObject obj=new SignUpPageObject(driver);
		
		obj.EnterFirstName().sendKeys("VAIBHAV");
		Thread.sleep(3000);
		obj.EnterFirstName().clear();
		Thread.sleep(3000);
		obj.EnterFirstName().sendKeys("vaibhav");
		Thread.sleep(3000);
		obj.EnterFirstName().clear();
		Thread.sleep(3000);
		obj.EnterFirstName().sendKeys("vaibhav1");
		Thread.sleep(3000);
		obj.EnterFirstName().clear();
		Thread.sleep(3000);
		obj.EnterFirstName().sendKeys("vaibhav@1");
		Thread.sleep(3000);
		obj.EnterFirstName().clear();
		Thread.sleep(3000);
		obj.EnterFirstName().sendKeys("VAIBHAV");
		Thread.sleep(3000);
		
		obj.EnterLastName().sendKeys("JARILE");
		Thread.sleep(3000);
		obj.EnterLastName().clear();
		obj.EnterLastName().sendKeys("jarile");
		Thread.sleep(3000);
		obj.EnterLastName().clear();
		Thread.sleep(3000);
		obj.EnterLastName().sendKeys("jarile1");
		Thread.sleep(3000);
		obj.EnterLastName().clear();
		Thread.sleep(3000);
		obj.EnterLastName().sendKeys("JARILE");
		Thread.sleep(3000);
		
		obj.EnterEmail().sendKeys("vaibhavjarile@gmail.com");
		Thread.sleep(3000);
		obj.EnterEmail().clear();
		Thread.sleep(3000);
		
		obj.EnterJobTtitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		obj.EnterJobTtitle().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		obj.EnterCompany().sendKeys("SSQUAREITSOLUTION");
		Thread.sleep(3000);
		obj.EnterCompany().clear();
		Thread.sleep(3000);
		
		obj.EnterEmployees().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		obj.EnterEmployees().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		obj.EnterPhone().sendKeys("1234567890");
		Thread.sleep(3000);
		obj.EnterPhone().clear();
		Thread.sleep(3000);
		
		obj.EnterCountry().sendKeys("India");
		Thread.sleep(3000);
		//obj.EnterCountry().clear();
		//Thread.sleep(3000);
		
		obj.EnterState().sendKeys("Maharashtra");
		Thread.sleep(3000);
		//obj.EnterState().clear();
		Thread.sleep(3000);
		
		obj.ClickOnIagree().click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
