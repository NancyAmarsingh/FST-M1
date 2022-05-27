package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class activity1 {

    AndroidDriver<MobileElement> driver;

    //Package :  "com.sec.android.app.popupcalculator"
    //Activity : ".Calculator"
  @BeforeClass
    public void Setup() throws MalformedURLException {
        // Add Desired capabilities based on Device connected


      DesiredCapabilities dc = new DesiredCapabilities();
      dc.setCapability("deviceName","Galaxy J7 Prime");
      dc.setCapability("platformName", "android");
      dc.setCapability("automationName", "UiAutomator2");
      dc.setCapability("deviceid","5203f6086437c3c5");
      dc.setCapability("appPackage","com.sec.android.app.popupcalculator");
      dc.setCapability("appActivity",".Calculator");
        //Appium Driver Initiation

        URL appiumserver;
        appiumserver = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(appiumserver,dc);


    }

  @Test
    public void multiply2Num()

    {
       driver.findElementById("bt_07").click();
       // Assert.assertTrue(driver.findElementById("bt_07").isDisplayed());
       // driver.findElementByXPath("//android.widget.Button[contains(@text, '5')]").click();
        driver.findElementByAccessibilityId("Multiplication").click();
        driver.findElementById("bt_07").click();
        driver.findElementByAccessibilityId("Equal").click();

        String output = driver.findElement(MobileBy.id("txtCalc")).getText();
        System.out.println("OUTPUT=" + output);
        Assert.assertEquals(output, 49);



    }

}
