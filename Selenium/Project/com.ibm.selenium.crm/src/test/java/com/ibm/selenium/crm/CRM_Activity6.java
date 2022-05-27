package com.ibm.selenium.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRM_Activity6 {

	
	public static void main (String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		WebElement username = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebElement activities = driver.findElement(By.id("grouptab_3"));
		System.out.println(activities.isEnabled());
		@SuppressWarnings("deprecation")
		WebDriverWait wt = new WebDriverWait(driver,6);
	      // elementToBeClickable expected criteria
	      wt.until(ExpectedConditions.elementToBeClickable (By.id("grouptab_3")));
	      System.out.println("Current page title:" + driver.getTitle());
		
		driver.close();
	}
}
