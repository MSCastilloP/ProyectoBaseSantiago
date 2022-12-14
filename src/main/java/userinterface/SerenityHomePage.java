package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityHomePage extends PageObject {

    public static final Target OPEN_TAB_ORGANIZATION = Target.the("OPEN_TAB_ORGANIZATION").located(By.linkText("Organization"));
    public static final Target LINK_ORGANIZATION = Target.the("span organization").located(By.linkText("Business Units"));


}
