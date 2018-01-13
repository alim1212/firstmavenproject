package pages.devtrcko;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	
public LoginPage(){
		
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//WebDriver driver;
	
	
	@FindBy(id="login-mobile")
	WebElement  webElementOfloginMobile_Txt;
	
	@FindBy(id="login-password")
	WebElement webelementOfloginPassword_Txt;
	
	@FindBy(id="sub_btn")
	WebElement webelementflogin_Btn;
	
	@FindBy(xpath="//div[@id='navbar-collapse']/ul/li[5]/a")
	WebElement webelementLoginlink;
	
	public void Click_LoginLnk()
	{
		webelementLoginlink.click();
		
	}

	public TrackoProducts  loginSteps(String mbl,String pass)
	{

		webElementOfloginMobile_Txt.sendKeys(mbl);
		
		webelementOfloginPassword_Txt.sendKeys(pass);

		webelementflogin_Btn.click();
		
		return new TrackoProducts();
		
	}
	

	public void waitforelement(int x)
	{
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
