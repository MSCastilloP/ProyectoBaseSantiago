package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.AnswerModule;
import tasks.*;

public class CreateBusinessUnitStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user entered correctly and is in the Business Units module$")
    public void theUserEnteredCorrectlyAndIsInTheBusinessUnitsModule() {
        OnStage.theActorCalled("Admin").wasAbleTo(OpenUp.thePage());
        OnStage.theActorInTheSpotlight().attemptsTo(EnterLoginData.onThePage());
        OnStage.theActorInTheSpotlight().wasAbleTo(FinishLogin.onThePage());
        OnStage.theActorCalled("admin").wasAbleTo(SearchBusinessUnits.onThePage());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerModule.toThe("Business Units")));
    }


    @When("^the user enters a new business unit$")
    public void theUserEntersANewBusinessUnit() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickNewBussinesUnit.onThePage());
    }

    @Then("^the new item will be added to the list$")
    public void theNewItemWillBeAddedToTheList()  {
    }
}
