package runner;

import activities.whenDo.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepsWhenDoClean {
    MainWhenDoScreen mainWhenDoScreen = new MainWhenDoScreen();
    NewNotes newNotes = new NewNotes();
    NewReminder newReminder = new NewReminder();
    InfoNotes infoNotes = new InfoNotes();

    @Given("I have access to WhenDo App")
    public void iHaveAccesToWhenDoApp() {
    }

    @When("I select the {} button")
    public void iSelectTheButton(String btnAll) throws MalformedURLException {
        mainWhenDoScreen.buttonWhenDoMap.get(btnAll).click();
    }

    @And("I select data to create the reminder")
    public void iSelectDataToCreateTheReminder() throws MalformedURLException {
        newReminder.addDate();
        newReminder.addTime();
        newReminder.addReminder();
        newReminder.addRepeater();

    }

    @And("I add the title {string} and the note {string}")
    public void iAddTheTitleAndTheNote(String title, String note) throws MalformedURLException {
        newNotes.titleTxtBox.setText(title);
        newNotes.noteTxtBox.setText(note);
    }

    @Then("the title {string} and the note {string} should be displayed in my list")
    public void theTitleAndTheNoteShouldBeDisplayedInMyList(String title, String note) {
        Assert.assertTrue("ERROR no se creo el Titulo",infoNotes.verifyReminderTitle(title));
        Assert.assertTrue("ERROR no se creo la Nota",infoNotes.verifyReminderNote(note));

    }
}
