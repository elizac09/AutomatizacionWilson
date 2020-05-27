package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.PaginaAuto;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenUp implements Task
{
    private PaginaAuto linkPage;

    public static OpenUp thePage()
    {
        return instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(linkPage));
    }
}
