package tests;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import com.beust.jcommander.Parameter;

import worldex.Login;


public class LoginTest extends TestBase {
	
	//@Test(priority=5)
	//@Parameters({"email","password"})
	@Test
	public void varify() throws Exception
	{
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.login_btn();
		login.setmail("siddharthjadeja15@gmail.com");
		login.setpwd("Mxi@1234");
		login.button();
		
	}
	

	@Test(priority=1)
	public void varify1() throws Exception
	{
		Login login= PageFactory.initElements(driver, Login.class);
		login.login_btn();
		login.setmail("");
		login.setpwd("");
		login.button();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_frm\"]/label")).getText(),"Please enter a valid email address.");
		
	}
	
	@Test(priority=2)
	public void varify2() throws Exception
	{
		Login login= PageFactory.initElements(driver, Login.class);
		login.login_btn();
		login.setmail("siddharthjadeja15@gmail.com");
		login.setpwd("mxi@1234");
		login.button();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_frm\"]/label")).getText(),"Please enter a valid email address.");
		
	}
	
	@Test(priority=3)
	public void varify3() throws Exception
	{
		Login login= PageFactory.initElements(driver, Login.class);
		login.login_btn();
		login.setmail("siddharthjadeja");
		login.setpwd("Mxi@1234");
		login.button();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_frm\"]/label")).getText(),"Please enter a valid email address.");
		
	}

	@Test(priority=4)
	public void varify4() throws Exception
	{
		Login login= PageFactory.initElements(driver, Login.class);
		login.login_btn();
		login.setmail("siddharthjadeja@gmail.com");
		login.setpwd("mxi@1234");
		login.button();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_frm\"]/label")).getText(),"Please enter a valid email address.");
		
	}
}
