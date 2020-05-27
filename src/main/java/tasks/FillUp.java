package tasks;

import models.DataDrivenAuto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import userinterfaces.CheckInPage;

import java.util.List;

public class FillUp implements Task
{
   private List<DataDrivenAuto> datos;

    public FillUp(List<DataDrivenAuto> datos) {
        this.datos = datos;
    }

    public static Performable insertInformation(List<DataDrivenAuto> lista)
    {
        return Tasks.instrumented(FillUp.class, lista);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(datos.get(0).getFirstName()).into(CheckInPage.firstName),
                Enter.theValue(datos.get(0).getLasName()).into(CheckInPage.lasttName),
                Enter.theValue(datos.get(0).getEmail()).into(CheckInPage.email),
                Enter.theValue(datos.get(0).getPhone()).into(CheckInPage.phone),
                Enter.theValue(datos.get(0).getPassword()).into(CheckInPage.password),
                Enter.theValue(datos.get(0).getPassword()).into(CheckInPage.confirm_password)
        );


        actor.attemptsTo(Check.whether(datos.get(0).getGender().toString().trim().toUpperCase().equals("MAN")).
                        andIfSo(Click.on(CheckInPage.genderMan)).otherwise(Click.on(CheckInPage.genderWoman)));

        actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getCountry()).from(CheckInPage.country),
                SelectFromOptions.byVisibleText(datos.get(0).getYear()).from(CheckInPage.year),
                SelectFromOptions.byVisibleText(datos.get(0).getMonth()).from(CheckInPage.month),
                SelectFromOptions.byVisibleText(datos.get(0).getDay()).from(CheckInPage.day));




        actor.attemptsTo(Click.on(CheckInPage.buttonSubmit));




    }

}
