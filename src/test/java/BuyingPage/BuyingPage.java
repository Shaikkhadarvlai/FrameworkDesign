package BuyingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SwagLabs.utility.Utility;

public class BuyingPage 
{
private WebDriver driver;
	
	public  BuyingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locators
	private By Buybutton=By.xpath("//input[@value='Buy Now']");
	private By quantity=By.xpath("//select[@name='quantity']");
	
	//Methods
	public void selectQuanrirty()
	{
	WebElement qua=	driver.findElement(quantity);
	  Utility.selectBasedDropdown(qua,"3"); 
	}
	public void clcickbutton()
	{
		driver.findElement(Buybutton).click();
	}

}
