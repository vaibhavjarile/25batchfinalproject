package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
    
		public SignUpPageObject(WebDriver driver2) {
		  this.driver=driver2;
	}
		public WebDriver driver;
        
        private By FirstName=By.xpath("//input[@name='UserFirstName']");
        private By LastName=By.xpath("//input[@name='UserLastName']");
        private By Email=By.xpath("//input[@name='UserEmail']");
        private By JobTitle=By.xpath("//select[@name='UserTitle']");
        private By Company=By.xpath("//input[@name='CompanyName']");
        private By Employees=By.xpath("//select[@name='CompanyEmployees']");
        private By Phone=By.xpath("//input[@name='UserPhone']");
        private By Country=By.xpath("//select[@name='CompanyCountry']");
        private By State=By.xpath("//select[@name='CompanyState']");
        private By Iagree=By.xpath("(//div[@class='checkbox-ui'])[1]");
        
        public WebElement EnterFirstName()
        {
			return driver.findElement(FirstName);
			
        }
        public WebElement EnterLastName()
        {
			return driver.findElement(LastName);
        	
        }
        public WebElement EnterEmail()
        {
			return driver.findElement(Email);
        	
        }
        public WebElement EnterJobTtitle()
        {
			return driver.findElement(JobTitle);
        	
        }
        public WebElement EnterCompany()
        {
			return driver.findElement(Company);
        	
        }
        public WebElement EnterEmployees()
        {
			return driver.findElement(Employees);
        	
        }
        public WebElement EnterPhone()
        {
			return driver.findElement(Phone);
        	
        }
        public WebElement EnterCountry()
        {
			return driver.findElement(Country);
        	
        }
        public WebElement EnterState()
        {
        	return driver.findElement(State);
        }
        
         public WebElement ClickOnIagree()
        {
			return driver.findElement(Iagree);
        	
        }
        
        
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


