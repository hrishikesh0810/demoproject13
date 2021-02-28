package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Page.LoginPage;

public class LoginTest {

	public WebDriver driver;
	public LoginPage lp;
	@BeforeMethod
	public void setUp() {
	 		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 		driver = new ChromeDriver();// browser open
			driver.get("file:///E:/Selenium%20Programs/Offline%20Website/Offline%20Website/index.html");
		
		lp=new LoginPage(driver);
	}

	@Test// tester working login page
	public void validLoginTest() {
		lp.enterUname("mangesh@gmail.com");
		lp.enterPass("123456");
		lp.clickLogin();
	}
	
	@Test// tester working on Dashboard page
	public void test02() {
		lp.ValidLogin();
		Assert.assertEquals(driver.getTitle(),lp.getTitle());
	}
}
