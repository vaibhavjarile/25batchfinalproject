package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import resourceses.BaseClass;

public class VerifyLoginPage extends BaseClass {
	
	@Test
	
	public void verifylogin() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		FileInputStream FS=new FileInputStream("C:\\Users\\Vaibh\\Desktop\\excel.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(FS);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell=row.getCell(0);
		
		XSSFCell a=row.getCell(0);
		XSSFCell b=row.getCell(1);
		
		obj.EnterUsername().sendKeys("vaibhavjarile@gmail.com");
		
		Thread.sleep(3000);
		
		obj.EnterPassword().sendKeys("vaibhav@1");
		
		Thread.sleep(3000);
		
		//obj.ClickOnLogin().click();
		
		//Thread.sleep(3000);
		
		obj.ClickOnTryForFree().click();
		
		Thread.sleep(3000);
		
		
		
	}

}
