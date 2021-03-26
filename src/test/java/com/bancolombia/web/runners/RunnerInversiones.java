package com.bancolombia.web.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/inversiones/inversiones.feature"},
        glue = {"com.bancolombia.web.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerInversiones {
}
