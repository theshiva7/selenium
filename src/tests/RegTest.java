package tests;

import  java.io.IOException;
import worldex.Register;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
import org.testng.annotations.*;

public class RegTest extends TestBase  {
	
	@Test
	public void init() throws Exception
	{
		Register reg=PageFactory.initElements(driver, Register.class);
		reg.regi_btn();
		reg.user_name("username");
		reg.first_name(null);
		reg.last_name(null);
		reg.email(null);
		reg.password(null);
		reg.confirm_pwd(null);
		reg.reference(null);
		reg.register_btn();
	}

}
