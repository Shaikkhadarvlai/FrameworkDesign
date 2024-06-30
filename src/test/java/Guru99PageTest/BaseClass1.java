package Guru99PageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Guru99Page.Productpage;



public class BaseClass1
{
	public WebDriver driver;
	public Productpage pa;
	
	
	@BeforeTest
	public void setBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	   
	    
	   pa=new Productpage (driver);
	    
	
	
	
	}
	

}
