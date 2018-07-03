package tests;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestBase {

	public static WebDriver driver=null;
	@BeforeSuite
	public void initialize() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "/home/mxicoders/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://worldex.io/demo");
	}
	
	
	@AfterSuite
	public void exit() {
		TestBase.driver.quit();
		
	}
}
