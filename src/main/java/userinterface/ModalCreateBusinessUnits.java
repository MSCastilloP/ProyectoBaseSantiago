package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalCreateBusinessUnits extends PageObject {
    public static final Target INPUT_NAME_BUSINESS_UNIT = Target.the("input name business unit").located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]"));
    public static final Target DROPDOWN_PARENT_UNIT = Target.the("DROPDOWN PARENT UNIT").located(By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId"));
    public static final Target INPUT_PARENT_UNIT = Target.the("INPUT PARENT UNIT").located(By.xpath("//*[@id=\"s2id_autogen1_search\"]"));
    public static final Target OPTION_PARENT_UNIT = Target.the("OPTION PARENT UNIT").located(By.xpath("/html/body/div[7]/ul/li/div"));
    public static final Target SAVE_BUSINESS_UNIT_BUTTON = Target.the("SAVE_BUSINESS_UNIT_BUTTON").located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[1]"));

}
