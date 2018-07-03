package worldex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
