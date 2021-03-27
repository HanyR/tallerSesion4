package singletonSession;

import factoryDevice.FactoryDevices;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;

public class Session {
    //attrubyto del mismo tipo de la clase
    private static Session mySession= null;
    private AppiumDriver driver;

    //constructor debe ser privado se instancia una vez cuando la session inicia
    private Session() throws MalformedURLException {
        //driver = FactoryDevices.make(FactoryDevices.ANDROID).create();
        //driver.manage().window().setSize(new Dimension(10,10));
        driver= FactoryDevices.make(FactoryDevices.CLOUD_DEVICE).create();
    }

    //metodo estatico para determinar la creación del atributo
    public static Session getInstance() throws MalformedURLException {
        //si no es nulo retorna session, si es nulo, crea session y retorna
        //siempre debo retornar sesion sea null o no
        if(mySession==null)
            mySession= new Session();
        return mySession;
    }

    public AppiumDriver getDriver(){
            return driver;
    }

    public void closeSession(){
        driver.quit();
        mySession=null;
    }
}
