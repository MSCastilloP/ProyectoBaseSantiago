package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import userinterface.SerenityHomePage;

public class SearchBusinessUnits implements Task {

    public static SearchBusinessUnits onThePage() {
        return Tasks.instrumented(SearchBusinessUnits.class);
    }
    WebDriver driver = new ChromeDriver();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {

            actor.attemptsTo(Click.on(SerenityHomePage.OPEN_TAB_ORGANIZATION));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(SerenityHomePage.LINK_ORGANIZATION));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
