package worldex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login {

	WebDriver driver;
	
	public void login(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="/html/body/header/div/nav/div/div[2]/ul[2]/li[1]/a") WebElement login_btn;
	@FindBy(how=How.XPATH, using="//input[@type='email']") WebElement emailbox;
	@FindBy(how=How.XPATH, using="//input[@type='password']")WebElement password;
	@FindBy(how=How.XPATH, using="//button[@type='submit']")WebElement login;
	
	public void login_btn() 
	{
	 login_btn.click();	
		
	}
	
	
	public void setmail(String mailid) 
	{
		
		emailbox.sendKeys(mailid);
		
		String error_mesg=driver.findElement(By.xpath("//*[@id=\"login_frm\"]/label[1]")).getText();
		String expected_mesg="This field is required.";
		Assert.assertEquals(error_mesg, expected_mesg);
		Assert.assertTrue(error_mesg.contains("This field is required."));
	}
	
	public void setpwd(String pwd) 
	{
		password.sendKeys(pwd);
		
		
	}
	
	public void button() 
	{
		login.click();
	}
	
	
	

}
