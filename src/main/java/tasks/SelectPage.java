package tasks;

import models.DataDrivenAuto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.PaginaAuto;

import java.util.List;

public class SelectPage implements Task
{
    private List<DataDrivenAuto> datos;

    public SelectPage(List<DataDrivenAuto> datos) {
        this.datos = datos;
    }

    public static Performable selectPage(List<DataDrivenAuto> lista)
    {
        return Tasks.instrumented(SelectPage.class, lista);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        System.out.println("if uno");
     //   if(pagina.equals("WebTable"))
     //   {
            actor.attemptsTo(Click.on(PaginaAuto.pageWebTable));
     //   }

    }
}
