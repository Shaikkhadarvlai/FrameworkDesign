package Guru99PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99Page.Productpage;

public class ProductpageTest extends BaseClass1
{

	@Test(priority=1)
	public void testUrl()
	{

		  String curl=pa.getUrl();
		  Assert.assertTrue(curl.contains("amazon"),"Fail:Url is not matches");
		  System.out.println("Url is matched!: "+curl);
	}
	
  @Test(priority=2)
  public void clickbutton() 
  {
	pa.clickbutton();
  }
}
