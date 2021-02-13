package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.Page.DashboardPage;

public class DashboardTest {

	WebDriver driver;
	DashboardPage dp;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.drive", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium%20Programs/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		
	}
	

}
