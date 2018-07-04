package tests;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
import org.testng.annotations.Test;
import worldex.Login;


public class LoginTest extends TestBase {
	
	@Test
	public void init() throws Exception
	{
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.login_btn();
		login.setmail("siddharthjadeja15@gmail.com");
		login.setpwd("Mxi@1234");
		login.button();
		
	}

}
