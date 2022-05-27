package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class activity2

{
    AndroidDriver<MobileElement> driver;
    @BeforeClass
       public void webbrowsersetup() throws MalformedURLException
    {
        DesiredCapabilities dc = new DesiredCapabilities();


        dc.setCapability("deviceName", "Galaxy J7 Prime");
        dc.setCapability("platformName", "android");
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("appPackage", "com.android.chrome");
        dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        dc.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, dc);
    }

        @Test
                public void webpage()
        {
            driver.get("https://www.training-support.net/");

            WebDriverWait wait = null;
            wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));


            String title = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Training Support'")).getText();
            System.out.println("MainPage" +title);

            Assert.assertEquals("Training Support", title);

            driver.findElementByAccessibilityId("About Us").click();
            String title1 = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='About Us'")).getText();
            System.out.println("Second page "+ title1);
            Assert.assertEquals("Aboutus", title1);


            /*WebDriverWait wait = null;
            wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));*/

        }


    }


