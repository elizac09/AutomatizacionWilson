package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckInPage extends PageObject
{
    public static final Target firstName = Target.the(" ").located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target lasttName = Target.the(" ").located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target email = Target.the(" ").located(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
    public static final Target phone = Target.the(" ").located(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"));
    public static final Target genderMan = Target.the(" ").located(By.xpath("//label[1]//input[1]"));
    public static final Target genderWoman = Target.the(" ").located(By.xpath("//label[2]//input[1]"));
    public static final Target country = Target.the(" ").located(By.xpath("//select[@id='countries']"));

    public static final Target year = Target.the(" ").located(By.xpath("//select[@id='yearbox']"));
    public static final Target month = Target.the(" ").located(By.xpath("//select[@placeholder='Month']"));
    public static final Target day = Target.the(" ").located(By.xpath("//select[@id='daybox']"));

    public static final Target password = Target.the(" ").located(By.id("firstpassword"));
    public static final Target confirm_password = Target.the(" ").located(By.id("secondpassword"));


    public static final Target buttonSubmit = Target.the(" ").located(By.id("submitbtn"));
}
