package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

import java.net.MalformedURLException;

public class ControlAppium {
    //protected porq se utilizará herencia, tiene accesso dentro del package
    protected WebElement control;
    protected By locator;

    public ControlAppium(By locator){
        this.locator= locator;

    }

    public void findControl() throws MalformedURLException {
        //no importa el tipo de control utilizar este para todas las llamadas
        this.control = Session.getInstance().getDriver().findElement(this.locator);
    }

        //click
    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }
    //verificar si se muestra
    public boolean isControlDisplayed(){
        try{
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    //obtener texto
    public String getText() throws MalformedURLException {
        this.findControl();
        return this.control.getText();
    }
}
