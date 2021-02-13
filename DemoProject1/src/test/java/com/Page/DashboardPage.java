package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getNavgation() {
		return driver.findElement(By.xpath("//li[contains(text(),'MAIN')]"));
	}
	String validtxt="MAIN NAVIGATION";
	public String checkNavigation() {
	
		return null;
	}
}
