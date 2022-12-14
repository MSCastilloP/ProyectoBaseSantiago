package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import questions.AnswerModule;
import tasks.EnterLoginData;
import tasks.FinishLogin;
import tasks.OpenUp;
import tasks.SearchBusinessUnits;

public class SearchBusinessUnitsPanelStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^Select the Bussines units panel$")
    public void selectTheBussinesUnitsPanel() {
        OnStage.theActorCalled("Admin").wasAbleTo(OpenUp.thePage());
        OnStage.theActorInTheSpotlight().attemptsTo(EnterLoginData.onThePage());
        OnStage.theActorInTheSpotlight().wasAbleTo(FinishLogin.onThePage());
        OnStage.theActorCalled("admin").wasAbleTo(SearchBusinessUnits.onThePage());
    }


    @Then("^Text appears that says Bussines Units$")
    public void textAppearsThatSaysBussinesUnits() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerModule.toThe("Business Units")));
    }
}
