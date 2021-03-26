package com.bancolombia.web.stepdefinitions;

import com.bancolombia.web.navigation.NavigateTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class InversionesStepDefinitions {

    String actor;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) ingresa a la web de Bancolombia$")
    public void IngresaALaWebDeBancolombia(String actor) {
        this.actor = actor;
        theActorCalled(actor).attemptsTo(NavigateTo.HomePage());
    }

    @When("^navega hasta los productos de inversion$")
    public void navegaHastaLosProductosDeInversion() {

    }

    @When("^selecciona el reglamente de inversion$")
    public void seleccionaElReglamenteDeInversion() {

    }

    @Then("^se realiza la descarga de un documento PDF$")
    public void seRealizaLaDescargaDeUnDocumentoPDF() {

    }
}
