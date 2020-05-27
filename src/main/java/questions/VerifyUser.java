package questions;

import models.DataDrivenAuto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.WebTable;

import java.util.List;

public class VerifyUser implements Question<Boolean>
{
    private List<DataDrivenAuto> datos;

    public VerifyUser(List<DataDrivenAuto> lista)
    {
        this.datos = lista;
    }


    public static VerifyUser answer(List<DataDrivenAuto> lista)
    {
        return new VerifyUser(lista);
    }

    @Override
    public Boolean answeredBy(Actor actor)
    {
        boolean result;
        String titulo  = Text.of(WebTable.tittle).viewedBy(actor).asString();

        System.out.println("Mostrar datos");
        System.out.println(titulo);
        System.out.println(datos.get(0).getAnswer());

        if (datos.get(0).getAnswer().equals(titulo))
        {
            result = true;
        }
        else
        { result = false;}
        return result;
    }
}
