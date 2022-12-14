package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SerenityLoginPage;

public class FinishLogin implements Task {


    public static FinishLogin onThePage() {
        return Tasks.instrumented(FinishLogin.class);
    }
    @Override
    public <T extends Actor>void performAs(T actor){
        actor.attemptsTo(Click.on(SerenityLoginPage.SIGN_IN_BUTTON));
    }
}
