package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataDrivenAuto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.mockito.internal.stubbing.answers.AnswerFunctionalInterfaces;
import questions.VerifyUser;
import tasks.FillUp;
import tasks.OpenUp;
import tasks.SelectPage;

import java.util.List;

public class AutomationDemoSiteStepdefinition
{

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Wilson wants to access on Web Automation Demo Site$")
    public void thatWantsToAccessOnWebAutomationDemoSite()
    {
        OnStage.theActorCalled("wilson").wasAbleTo(OpenUp.thePage());
    }


    @When("^he will check in on the page$")
    public void heWillCheckInOnThePage(List<DataDrivenAuto> lista)
    {
        System.out.println("LLegue");
        OnStage.theActorInTheSpotlight().attemptsTo(FillUp.insertInformation(lista));
    }

    @Then("^He will check on the screen,  it loads the text Double Click on Edit Icon to EDIT the Table Row$")
    public void heWillCheckOnTheScreenItLoadsTheTextDoubleClickOnEditIconToEDITTheTableRow(List<DataDrivenAuto> lista)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyUser.answer(lista)));
    }

    @When("^he looks for a date$")
    public void heLooksForADate(List<DataDrivenAuto> lista)
    {
//localizar la pestaña WebTable
        OnStage.theActorInTheSpotlight().attemptsTo(SelectPage.selectPage(lista));
        //buscar el correo

    }

    @And("^he select the option Delete with right click$")
    public void heSelectTheOptionDeleteWithRightClick()
    {

    }

    @Then("^He will check on the screen, the date do not exist$")
    public void heWillCheckOnTheScreenTheDateDoNotExist(List<DataDrivenAuto> lista)
    {

    }





}
