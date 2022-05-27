package fst_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
	public static void main(String[] args) {
		 
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
 
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        
        System.out.println(driver.getTitle());
        
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        
        System.out.println(checkbox.isSelected());
        
        checkbox.click();
        
        System.out.println(checkbox.isSelected());
        
        driver.close();
        
        
}
}