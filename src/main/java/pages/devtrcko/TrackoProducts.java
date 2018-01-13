package pages.devtrcko;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.util.TestUtil;

public class TrackoProducts extends TestBase{	
	
	
	
	@FindBy(xpath="//div[@id='navbar-collapse']/ul/li[2]/a")
	WebElement webelementProductlnk;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-cta-primary']")
	WebElement webelementOrdernowlnk;
	
	
	
	
	//h3[contains(text(),'TRACKO-VT1')]/following::a[contains(text(),'Details')][1]
	
	public void ClickonProducts()
	
	{
		webelementProductlnk.click();
		
	}
	
	public TrackoProducts()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public TrackoOrder SelectProduct()
	{
		driver.findElement(By.xpath("//h3[contains(text(),'TRACKO-VT1')]/following::a[contains(text(),'Details')][1]")).click();
		driver.manage().timeouts().implicitlyWait(TestUtil.implicityWait, TimeUnit.SECONDS);
		webelementOrdernowlnk.click();
		return new TrackoOrder();
	}
	

}
