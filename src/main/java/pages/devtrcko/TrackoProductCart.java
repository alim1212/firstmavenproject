package pages.devtrcko;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class TrackoProductCart extends TestBase {
	
	@FindBy(xpath="//input[@id='billingName']")	
	WebElement webelementbillingnametextbox;
	
	@FindBy(xpath="//input[@id='billingStreet']")
	WebElement webelementbiilingstreet;
	
	@FindBy(xpath="//input[@id='billingCity']")
	WebElement webelementbillingCity;
	
	@FindBy(xpath="//input[@id='billingState']")
	WebElement webelementbillingState;		
	
	@FindBy(xpath="//input[@id='billingPincode']")
	WebElement webelementchyangeaddress;
	
	@FindBy(xpath="//button[@id='btn-edit']")
	WebElement webelementbillingPincode;
	
	@FindBy(xpath="//input[@id='copyAddress']")
	WebElement webelementcopyaddresscheckbox;
	
	@FindBy(xpath="//button[contains(text(),'Submit Order')]")
	WebElement webelementsubmitorderbtn;

	
	public TrackoProductCart()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void BillingAddress()
	{
		
		
	}
	
	public void ClickOnSubmitOrder()
	{
		
		
	}

}
