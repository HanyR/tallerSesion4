package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice{

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","HUAWEI Y7 2018");
        capabilities.setCapability("platformVersion","8.0.0");
        //capabilities.setCapability("appPackage","com.android.calculator2");
        //capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity",".ui.HomeActivity");
        capabilities.setCapability("platformName","Android");
        // driver apunte a nuestro appiumDesktop
        AppiumDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        // implicit:
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
