package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SerenityLoginPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("text field to fill the username").located(By.id("LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("text field to fill the password").located(By.id("LoginPanel0_Password"));
    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button").located(By.id("LoginPanel0_LoginButton"));
    public static final Target TITLE_HOME = Target.the("TITLE HOME").located(By.xpath("//h1[contains(text(),'Dashboard')]"));


}
