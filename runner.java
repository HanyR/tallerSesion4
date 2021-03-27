package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import singletonSession.Session;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
public class runner {
    /**
     * Si ejecuto cualquiera de mis clases .feature se ejecutara el after y el before
     * estos son los "hooks": es decir acciones antes y despues de c/escenario
     */
    @Before
    public void beforeCucumber(){

        System.out.println("BEFORE CUCUMBER");
    }

    @After
    public void afterCucumber(Scenario scenario) throws MalformedURLException {
        if(scenario.isFailed()){
            //reporte con screens
            byte[] screenShoot=Session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShoot,"image/png","Failed Step Mobile");
        }
        //System.out.println("AFTER CUCUMBER");
        //driver.quit();
        Session.getInstance().closeSession();
    }

}
