package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class PaginaAuto extends PageObject
{
    public static final Target pageWebTable = Target.the(" ").located(By.xpath("//a[contains(text(),'WebTable')]"));

}
