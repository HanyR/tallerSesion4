package activities.whenDo;

import controls.Label;
import org.openqa.selenium.By;

public class InfoNotes {

    public boolean verifyReminderTitle(String title){
        Label infoTitle = new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return infoTitle.isControlDisplayed();
    }

    public boolean verifyReminderNote(String note){
        Label infoNote = new Label(By.xpath("//android.widget.TextView[@text='"+note+"']"));
        return infoNote.isControlDisplayed();
    }

    public InfoNotes(){

    }

}
