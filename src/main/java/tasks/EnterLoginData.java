package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SerenityLoginPage;

public class EnterLoginData implements Task {
    public static EnterLoginData onThePage() {
        return Tasks.instrumented(EnterLoginData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("admin").into(SerenityLoginPage.INPUT_USERNAME));
        actor.attemptsTo(Enter.theValue("serenity").into(SerenityLoginPage.INPUT_PASSWORD));
    }

}
