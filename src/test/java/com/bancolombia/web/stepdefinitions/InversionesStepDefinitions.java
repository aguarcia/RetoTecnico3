package com.bancolombia.web.stepdefinitions;

import com.bancolombia.web.task.SeleccionarDescargaReglamento;
import com.bancolombia.web.util.ReadPdf;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.MalformedURLException;

import static com.bancolombia.web.task.NavegarProductosInversion.navegarProductosInversion;
import static com.bancolombia.web.task.SeleccionarDescargaReglamento.seleccionarDescargaReglamento;
import static com.bancolombia.web.util.WebDriverFactory.getWebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InversionesStepDefinitions {

    private WebDriver chrome;
    private EnvironmentVariables environmentVariables;
    String downloadFolder;
    String fileName;

    @Before
    public void setTheStage() throws MalformedURLException {
        chrome = getWebDriver();

//        downloadFolder = environmentVariables.optionalProperty("download.filesFolder")
//                .orElseThrow(IllegalArgumentException::new);
//        fileName = environmentVariables.optionalProperty("statements.fileName")
//                .orElseThrow(IllegalArgumentException::new);

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) ingresa a la web de Bancolombia$")
    public void IngresaALaWebDeBancolombia(String actor) {

        theActorCalled(actor).can(BrowseTheWeb.with(chrome));
    }

    @When("^navega hasta los productos de inversion$")
    public void navegaHastaLosProductosDeInversion() {
        theActorInTheSpotlight().attemptsTo(
            navegarProductosInversion()
        );
    }

    @When("^selecciona el reglamente de inversion$")
    public void seleccionaElReglamenteDeInversion() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                seleccionarDescargaReglamento()
        );
        Thread.sleep(10000);
    }

    @Then("^se realiza la descarga de un documento PDF$")
    public void seRealizaLaDescargaDeUnDocumentoPDF() throws IOException {
//        String statementFilePath = String.format("%s/%s", "/Users/aguarcia/Downloads", "Contrato+Inversion+Virtual.pdf");
//
//        theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPath(statementFilePath));
//
//        String pdfText = ReadPdf.as(theActorInTheSpotlight()).getText();
//
//        System.out.println(pdfText);
    }
}
