package activities.calculadora;

import controls.Button;
import org.openqa.selenium.By;

public class MainCalculatorActivity {
    public Button sumaButton = new Button(By.id("com.android.calculator2:id/op_add")); //com.android.calculator2:id/op_add
    public Button equalButton = new Button(By.id("com.android.calculator2:id/eq"));
    public Button nineButton = new Button(By.id("com.android.calculator2:id/digit_9"));
    public Button twoButton = new Button(By.id("com.android.calculator2:id/digit_2"));
    public Button resultLabel = new Button(By.id("com.android.calculator2:id/formula"));
    public MainCalculatorActivity(){}
}
