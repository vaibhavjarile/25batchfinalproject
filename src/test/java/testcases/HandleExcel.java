package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleExcel {
	
	@Test
	
	public void handleexcel() throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\Vaibh\\Desktop\\excel.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell=row.getCell(0);
		
		XSSFCell A=row.getCell(0);
		XSSFCell B=row.getCell(1);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		System.out.println(sheet.getRow(0).getCell(1));
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.click();
		Thread.sleep(3000);
		
		username.sendKeys(A.getStringCellValue());
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		Thread.sleep(3000);
		
		password.sendKeys(B.getStringCellValue());
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
	}

}
