package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTable extends PageObject
{
    public static final Target tittle = Target.the(" ").located(By.xpath("//h4[1]"));
}
