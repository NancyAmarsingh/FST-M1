package com.ibm.selenium.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class CRM_Activity1 {
	
	public static void main (String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
        String actualtitle = driver.getTitle();
        String expectedtitle = "SuiteCRM";
        
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
}
}
