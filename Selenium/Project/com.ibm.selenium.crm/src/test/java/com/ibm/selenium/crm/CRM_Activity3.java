package com.ibm.selenium.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity3 {
	
	/*
	 * Get the copyright text
Goal: Print the first copyright text in the footer to the console
	 */
	
	
	public static void main (String[] args) {
		
	/*
	 *  Get the url of the header image
        Goal: Print the url of the header image to the consol
	 */
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/crm");
	
	//(By.xpath("//img[@alt ='SuiteCRM']")); /div[@class="p_login"]/div[@class="p_login_bottom"]//a[1]@id
	
	/*WebElement footer = driver.findElement
	(By.xpath("//div[contains(@class,'p_login')]//div[contains(@class,'p_login_button')]//a[contains(@id = 'admin_options)]"));
	*/
	
	//WebElement footer = driver.findElement(By.xpath("//div[@class ='p_login']"));
	WebElement footer = driver.findElement(By.id("admin_options"));
			System.out.println(footer.getText());
	
			driver.close();
			
	}

}
