package fst_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actiivty3 {
	
	public static void main (String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println(driver.getTitle());
		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Nancy");
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("Amarsingh");
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("nancy@gmail.com");
		WebElement ContactNumber = driver.findElement(By.id("number"));
		ContactNumber.sendKeys("8199101001");
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		driver.close();
	}
}
		


