package pages.devtrcko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class TrackoOrder extends TestBase {
	
	@FindBy(xpath="//table[@id='planPricingTable']/tbody/tr[2]/td[2]/a")
	WebElement webelementselectplan;
	
	@FindBy(xpath="//input[@name='qnt']")
	WebElement webelementquantitytextbox;
	
	@FindBy(xpath="//button[@id='btnTabSecondNext']")
	WebElement webelementptnectbutton;
	
	@FindBy(xpath="//div[@id='vehicletextbox']/input[1]")
	WebElement webelementvehiclenotextbox;
	
	
	
	public TrackoOrder()
	{
		PageFactory.initElements(driver, this);
	}
	
	public TrackoProductCart SelectPlanDetails()
	{
		
		//select plan
		webelementselectplan.click();
		
		//enter quantity
		webelementquantitytextbox.sendKeys("1");
		
		//click on proceed to next
		webelementptnectbutton.click();
		
		//enter vehicle no
		webelementvehiclenotextbox.sendKeys("1234");
		
		driver.findElement(By.xpath("//button[text()='Add & Proceed To Checkout']")).click();;
		
		
		return new TrackoProductCart();
	}
	

}
