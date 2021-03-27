package activities.whenDo;

import controls.Button;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class NewReminder {
    public Button addDate = new Button(By.id("com.vrproductiveapps.whendo:id/due_date"));
    public Button btnDia = new Button(By.id("android:id/button3"));
    public Button btnAccept = new Button(By.id("android:id/button1"));
    public Button addTime = new Button(By.id("com.vrproductiveapps.whendo:id/time"));
    //public Button btnAcceptTime = new Button(By.id("android:id/button1"));
    public Button btnReminderMinutes = new Button(By.id("com.vrproductiveapps.whendo:id/reminder"));
    public Button btnSelectOption3 = new Button(By.xpath("//android.widget.RadioButton[3]"));
    public Button addRepeat= new Button(By.id("com.vrproductiveapps.whendo:id/repeat"));
    //public Button btnSelectRepeat = new Button(By.xpath("//android.widget.RadioButton[3]"));

    public void addDate() throws MalformedURLException {
        addDate.click();
        btnDia.click();
        btnAccept.click();
    }

    public void addTime() throws MalformedURLException {
        addTime.click();
        btnAccept.click();
    }

    public void addReminder() throws MalformedURLException {
        btnReminderMinutes.click();
        btnSelectOption3.click();
    }

    public void addRepeater() throws MalformedURLException {
        addRepeat.click();
        btnSelectOption3.click();

    }
}
