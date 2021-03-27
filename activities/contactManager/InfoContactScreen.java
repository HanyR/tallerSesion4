package activities.contactManager;
import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class InfoContactScreen {

    public Button backbutton = new Button(By.id("com.android.contacts:id/backImg"));

    public  InfoContactScreen(){}

    public boolean verifyContactIsDisplayed(String contact){
        Label infoContact = new Label(By.xpath("//android.widget.TextView[@text='"+contact+"']"));
        return infoContact.isControlDisplayed();
    }
}