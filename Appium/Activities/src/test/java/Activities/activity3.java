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

public class activity3 {

    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Galaxy J7 Prime");
        dc.setCapability("platformName", "android");
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("deviceid", "5203f6086437c3c5");
        dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        dc.setCapability("appActivity", ".Calculator");

        URL server = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(server, dc);

    }

    @Test
    public void ADD() {
        driver.findElementById("bt_05").click();
        driver.findElementByAccessibilityId("Plus").click();
        driver.findElementById("bt_09").click();
        driver.findElementByAccessibilityId("Equal").click();
        String Aoutput = driver.findElement(MobileBy.id("txtCalc")).getText();
        System.out.println("Addition of 5 + 9 =" + Aoutput);
        Assert.assertEquals(Aoutput, "14");
    }

    @Test
    public void Minus() {
        driver.findElementById("bt_01").click();
        driver.findElementById("bt_00").click();
        driver.findElementByAccessibilityId("Minus").click();
        driver.findElementById("bt_05").click();
        driver.findElementByAccessibilityId("Equal").click();

        String Soutput = driver.findElement(MobileBy.id("txtCalc")).getText();
        System.out.println("Minus of 10 - 5 =" + Soutput);
        Assert.assertEquals(Soutput, "5");
    }

    @Test
    public void Mutliplication() {
        driver.findElementById("bt_05").click();
        driver.findElementByAccessibilityId("Multiplication").click();
        driver.findElementById("bt_01").click();
        driver.findElementById("bt_00").click();
        driver.findElementById("bt_00").click();
        driver.findElementByAccessibilityId("Equal").click();

        String Soutput = driver.findElement(MobileBy.id("txtCalc")).getText();
        System.out.println("Multiply of 100 * 5 =" + Soutput);
        Assert.assertEquals(Soutput, "500");

            }

    @Test
    public void Division() {
        driver.findElementById("bt_05").click();
        driver.findElementById("bt_00").click();
        driver.findElementByAccessibilityId("Division").click();
        driver.findElementById("bt_02").click();


        driver.findElementByAccessibilityId("Equal").click();

        String Soutput = driver.findElement(MobileBy.id("txtCalc")).getText();
        System.out.println("Division of 50 % 2 =" + Soutput);
        Assert.assertEquals(Soutput, "25");

    }

        }




