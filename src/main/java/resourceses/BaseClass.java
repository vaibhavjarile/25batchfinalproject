package resourceses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;                        //Global by using static keyword
	
	public void driverInitialize() throws IOException
	{
		FileInputStream Fis=new FileInputStream("C:\\Users\\Vaibh\\vaibhavtestng\\25thBatchFinalProject\\src\\main\\java\\resourceses\\data.properties");
		
		Properties prop= new Properties();
		
		prop.load(Fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			 driver=new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		
		else 
		{
			System.out.println("please check the browser");
		}
		
	}

}
