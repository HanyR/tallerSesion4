package activities.contactManager;
import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class NewContactScreen {

    public TextBox nameTxtBox= new TextBox(By.xpath("//android.widget.EditText[@text='Name']"));
    public TextBox organizationTxtBox= new TextBox(By.xpath("//android.widget.EditText[@text='Organization']"));
    public TextBox phoneTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text='Phone number']"));
    public Button saveButton= new Button(By.id("android:id/icon2"));
    public NewContactScreen(){}
}
