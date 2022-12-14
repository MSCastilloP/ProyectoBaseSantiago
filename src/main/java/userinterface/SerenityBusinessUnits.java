package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityBusinessUnits extends PageObject {
    public static final Target TITLE_BUSINESS_UNITS = Target.the("Title Bussiness Units").located(By.xpath("//div[contains(text(),\"Business Units\")]"));
    public static final Target NEW_BUSINESS_UNIT_BUTTON = Target.the("New business unit button").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));

}
