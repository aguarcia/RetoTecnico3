package com.bancolombia.web.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaInicialPage {

    public static final Target OPC_PERSONAS = Target.the("Opcion a personas")
            .located(By.id("header-personas"));
}
