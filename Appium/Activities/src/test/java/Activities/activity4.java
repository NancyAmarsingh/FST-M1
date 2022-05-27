package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class activity4 {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass

    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName","Galaxy J7 Prime");
        dc.setCapability("platformName", "android");
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("deviceid","5203f6086437c3c5");
        dc.setCapability("appPackage","com.samsung.android.contacts");
        dc.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
        //Appium Driver Initiation

        URL appiumserver;
        appiumserver = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(appiumserver,dc);
        wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void Addcontact() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("ftu_later_text")));
        driver.findElementById("ftu_later_text").click();

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("floating_action_button_container")));
        driver.findElementById("floating_action_button_container").click();

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.TextView[@text=Phone]"))).wait(30);

        driver.findElementByXPath("//android.widget.TextView[@text=Phone]").click();
        driver.findElementById("button2").click();


        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@text='Name']")));
        driver.findElementByXPath("//android.widget.EditText[@text=Name]").sendKeys("ANancy");
        driver.findElementById("editors").sendKeys("1819199191");
        driver.findElementById("menu_done").click();

        System.out.println("Contact saved successfully");

    }
}
