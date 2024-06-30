package BuyingPageTest;

import org.testng.annotations.Test;

public class BuyingPageTest extends BaseClass
{
	@Test
	public void Testquantity()
	{
		bp.selectQuanrirty();
	}
  @Test
  public void TestBuybutton() 
  {
	  bp.clcickbutton();
  }
}
