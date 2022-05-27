package com.ibm.selenium.crm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CRM_Activity7 {
	
public static void main (String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		WebElement username = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		
		driver.findElement(By.className("dropdown-menu")).click();
		//driver.findElement(By.id("moduleTab_9_Leads")).click();
		driver.findElement(By.xpath("//a[@id ='moduleTab_9_Leads']")).click();
		
		
		/* Select select = new Select(dropdown);
		 * List<WebElement> options = select.getOptions();
		select.selectByVisibleText("Leads");*/
		
		
		WebElement popup = driver.findElement(By.className("suitepicon suitepicon-action-info"));
		popup.click();
}

}
