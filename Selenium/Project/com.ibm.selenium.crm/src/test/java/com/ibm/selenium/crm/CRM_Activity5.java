package com.ibm.selenium.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity5 {
	

	public static void main (String[] args) {
		
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/crm");
	WebElement username = driver.findElement(By.id("user_name"));
	WebElement password = driver.findElement(By.id("username_password"));
	username.sendKeys("admin");
	password.sendKeys("pa$$w0rd");
	driver.findElement(By.id("bigbutton")).click();
	WebElement Navigation = driver.findElement(By.id("toolbar"));
	System.out.println("COLOR OF NAVIGATION BAR :" + Navigation.getCssValue("color"));
    driver.close();
}
}

