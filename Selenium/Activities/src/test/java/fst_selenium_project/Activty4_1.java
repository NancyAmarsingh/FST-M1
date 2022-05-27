package fst_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activty4_1 {
	
	public static void main (String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(), 'About Us')]")).click();
	
		  System.out.println("Heading is: " + driver.getTitle());
		  
	        //Close the browser
	        driver.close();

}
}
