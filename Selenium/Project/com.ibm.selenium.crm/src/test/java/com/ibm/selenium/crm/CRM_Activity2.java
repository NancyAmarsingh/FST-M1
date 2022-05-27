package com.ibm.selenium.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity2
{
	

	public static void main (String[] args) {
	
	/*
	 *  Get the url of the header image
        Goal: Print the url of the header image to the consol
	 */
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/crm");
	
	WebElement header = driver.findElement(By.xpath("//img[@alt ='SuiteCRM']"));
    System.out.println(header.getAttribute("src"));
	


}

}
