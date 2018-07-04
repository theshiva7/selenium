package worldex;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
	
	public void reg(WebDriver driver) 
	{
		this.driver=driver;
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"navbar\"]/ul[2]/li[2]/a")WebElement regi_btn;
	@FindBy(how=How.XPATH, using="//*[@id=\"username\"]") WebElement user_name;
	@FindBy(how=How.XPATH, using="//*[@id=\"firstname\"]") WebElement first_name;
	@FindBy(how=How.XPATH, using="//*[@id=\"lastname\"]") WebElement last_name;
	@FindBy(how=How.XPATH, using="//*[@id=\"email\"]")WebElement email;
	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]")WebElement password;
	@FindBy(how=How.XPATH, using="//*[@id=\"conf_password\"]")WebElement confirm_pwd;
	@FindBy(how=How.XPATH, using="//*[@id=\"ref_by\"]")WebElement reference;
	@FindBy(how=How.XPATH, using="//*[@id=\"agree_box\"]")WebElement terms;
	@FindBy(how=How.XPATH, using="//*[@id=\"register_frm\"]/button")WebElement register_btn;

	public void regi_btn() 
	{
			regi_btn.click();
	}

	public void user_name(String username) 
	{
		user_name.sendKeys(username);
	}

	public void first_name(String fname)
	{
		first_name.sendKeys(fname);
	}
	public void last_name(String lname) 
	{
		last_name.sendKeys(lname);
	}
	
	public void email(String mailid)
	{
		email.sendKeys(mailid);
	}
	
	public void password(String pwd) 
	{
		password.sendKeys(pwd);
		
	}
	
	public void confirm_pwd(String c_pwd) 
	{
		confirm_pwd.sendKeys(c_pwd);
		
	}
	
	public void reference(String ref) 
	{
		reference.sendKeys(ref);
	}
	
	public void register_btn() 
	{
		register_btn.click();
	}
}
