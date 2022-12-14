package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
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

public class LoginStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^The user Admin must correctly enter his username and password, which he has previously registered\\.$")
    public void theUserMustCorrectlyEnterHisUsernameAndPasswordWhichHeHasPreviouslyRegistered()  {
        OnStage.theActorCalled("Admin").wasAbleTo(OpenUp.thePage());
        OnStage.theActorInTheSpotlight().attemptsTo(EnterLoginData.onThePage());
    }


    @When("^The user clicks on the login button$")
    public void theUserClicksOnTheLoginButton()  {
        OnStage.theActorInTheSpotlight().wasAbleTo(FinishLogin.onThePage());
    }

    @Then("^The user can successfully log in and look at their dashboard$")
    public void userCanLogInSuccessfully()  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Dashboard")));
    }

}
