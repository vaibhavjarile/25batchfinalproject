package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartObject {
	
	public AddToCartObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebDriver driver;
	
	private By Main=By.xpath("//*[@id=\"nav-hamburger-menu\"]/i");
	
	private By Electronic=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a/div");
	
	private By Mobile=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[6]/a");
	
	private By Trending=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[10]/div/div/div/div/div[2]/span/a/div/img");
	
	private By AddToCart=By.xpath("(//input[@class='a-button-input'])[4]");
	
	private By ToCart=By.xpath("//span[@id='nav-cart-count']");
	
	private By ProceedToCheckOut=By.xpath("//input[@name='proceedToRetailCheckout']");
      
	
	public WebElement MainSearch()
	{
		return driver.findElement(Main);
		
	}
	
	public WebElement Search()
	{
		return driver.findElement(Electronic);
		
	}
	
	public WebElement Accessories()
	{
		return driver.findElement(Mobile);
		
	}
	
	public WebElement Tripod()
	{
		return driver.findElement(Trending);
		
	}
	
	public WebElement TowardsCart()
	{
		return driver.findElement(AddToCart);
		
	}
	
	public WebElement GoToCart()
	{
		return driver.findElement(ToCart);
		
	}
	
	public WebElement CheckOut()
	{
		return driver.findElement(ProceedToCheckOut);
		
	}
	
	
	
	
	
}

