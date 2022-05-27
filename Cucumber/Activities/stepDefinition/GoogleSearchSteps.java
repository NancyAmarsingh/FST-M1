package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchSteps {

    WebDriver driver;
    @Given("^User on GooglePage$")
    public void OpenGoogle()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
            System.out.println("Opened");
    }
    @When("^User Types in cheese and enter$")
    public void GoogleSearch()
    {

        driver.findElement(By.name("q")).sendKeys("Cheese");

    }
    @Then("^Show how many search results where shown$")
    public void thenFunctionName()
    {
        String Searchresults = driver.findElement(By.id("result-stats")).getText();
        System.out.println(Searchresults);
    }
    @And("^Close the browser$")
    public void closeTheBrowser()  {
        driver.close();
    }
}
