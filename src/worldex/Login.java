package worldex;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
	
	//created new method for test and i stucked here.
	
	
	String s[] = {"siddharthjadeja, mxi@123", "siddharthjadeja1@gmail.com, Mxi@1234"};

	public void verifyLogin(String id[]) 
	{
	for (int i =0; i <id. length ; i++) {
	String credentials[] = id[i].split(",") ;
	String userName = credentials[0];
	String password = credentials[1];
	 boolean result = verifyUserName1(userName) ;
	 
	Assert.assertTrue(result);
	} 
	}

	public boolean verifyUserName1(String userName) {

	 driver.findElements(By.xpath("//input[@type='email']")).get(0).sendKeys(userName);

	try {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		return(driver. findElement(By.xpath("//*[@id=\"login_frm\"]/label")).isDisplayed()) ;

	} 
	catch(Exception e) {
	 return true;
	}
	}
	
	public void button() 
	{
		login.click();
	}

}
