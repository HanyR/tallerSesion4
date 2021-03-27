package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudDevice implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "hannycrisrojasp1");
        caps.setCapability("browserstack.key", "9XiNA8jJqAvuepLvCqpL");

        // Set URL of the application under test
        caps.setCapability("app", "bs://afcbed1ae3f55def0b89ce99d1687e5ff3b98202");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "JBGroup Mobile");
        caps.setCapability("build", "V000.1");
        caps.setCapability("name", "my connection to browser stack");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);


        /* Write your Custom code here */


        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        return driver;
    }
}
