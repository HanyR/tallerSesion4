package activities.calculadora;

import controls.Button;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class MainCalculatorScreen {

    public Map<String,Button> buttonMap = new HashMap<>(); //agrega un vector con nombre y direccion del componente

    public Button resultLabel = new Button(By.id("com.android.calculator2:id/formula"));

    public MainCalculatorScreen(){
        buttonMap.put("add", new Button(By.id("com.android.calculator2:id/op_add")));
        buttonMap.put("equal", new Button(By.id("com.android.calculator2:id/eq")));
        buttonMap.put("nine", new Button(By.id("com.android.calculator2:id/digit_9")));
        buttonMap.put("two", new Button(By.id("com.android.calculator2:id/digit_2")));



 }
}
