package Guru99Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Productpage
{
	private WebDriver driver;
	
	public  Productpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By buyclick=By.id("searchDropdownBox");
	
	
	
	//Methods 
	public String getUrl()
	{
	  return driver.getCurrentUrl();
	  
	}
	
	
	public void clickbutton ()
	{
	driver.findElement(buyclick).click();
	
			 
	 
	}

	
	
	
	
	
	

}
