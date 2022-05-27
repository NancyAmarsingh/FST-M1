package fst_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
	
	public static void main (String[] args)
	
	{
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.training-support.net/selenium/target-practice");
		Driver.findElement(By.xpath("//h1[@class = 'ui red header']")).click();
		WebElement fifth = Driver.findElement(By.xpath("//h5[@class = 'ui green header']"));
		System.out.println(fifth.getCssValue("Color"));
		System.out.println(Driver.getTitle());
		WebElement violet = Driver.findElement(By.xpath("//button[@class = 'ui violet button']"));
		System.out.println(violet.getAttribute("class"));
		String greyButton = Driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);
 
        //Close the browser
        Driver.close();
	}
	

	
	

}
