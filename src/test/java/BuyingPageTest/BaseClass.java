package BuyingPageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import BuyingPage.BuyingPage;

public class BaseClass 
{
	public WebDriver driver;
	public BuyingPage bp;
	
	@BeforeTest
	public void SetBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		bp=new BuyingPage(driver);
	}

}
