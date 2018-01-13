package test.devtracko;

import org.testng.annotations.Test;

import pages.devtrcko.LoginPage;
import pages.devtrcko.TrackoProducts;

import com.base.TestBase;

public class LoginTest extends TestBase{

	TrackoProducts trackobj;
	@Test
	
	public void Verify_Login()
	
	{		
		
		LoginPage lo=new LoginPage();
		trackobj=lo.loginSteps("9860890353", "family1234");
		
		
	}
}
