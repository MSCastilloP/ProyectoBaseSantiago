package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ModalCreateBusinessUnits;
import userinterface.SerenityBusinessUnits;

public class ClickNewBussinesUnit implements Task {
    public static ClickNewBussinesUnit onThePage() {
        return Tasks.instrumented(ClickNewBussinesUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SerenityBusinessUnits.NEW_BUSINESS_UNIT_BUTTON));
        actor.attemptsTo(Enter.theValue("UNIDAD DE NEGOCIO DE PRUEBA").into(ModalCreateBusinessUnits.INPUT_NAME_BUSINESS_UNIT));
        actor.attemptsTo(Click.on(ModalCreateBusinessUnits.DROPDOWN_PARENT_UNIT));
        actor.attemptsTo(Enter.theValue("PRUEBA SANTIAGO CASTILLO").into(ModalCreateBusinessUnits.INPUT_PARENT_UNIT));
        actor.attemptsTo(Click.on(ModalCreateBusinessUnits.OPTION_PARENT_UNIT));
        actor.attemptsTo(Click.on(ModalCreateBusinessUnits.SAVE_BUSINESS_UNIT_BUTTON));
    }
}
