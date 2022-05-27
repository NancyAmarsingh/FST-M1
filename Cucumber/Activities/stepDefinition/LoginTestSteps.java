package stepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login page$")

    public void OpenGoogle() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");

    }
}