package activities.whenDo;

import controls.Button;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class MainWhenDoScreen {
    public Map<String,Button> buttonWhenDoMap = new HashMap<>();

    public MainWhenDoScreen(){
        buttonWhenDoMap.put("add",new Button(By.id("com.vrproductiveapps.whendo:id/fab")));
        buttonWhenDoMap.put("reminder", new Button(By.id("com.vrproductiveapps.whendo:id/note_item_reminder")));
        buttonWhenDoMap.put("save", new Button(By.id("com.vrproductiveapps.whendo:id/saveItem")));
    }



}
