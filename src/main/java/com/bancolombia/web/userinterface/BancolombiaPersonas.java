package com.bancolombia.web.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaPersonas {

    public static final Target BUTTON_SOLICITUD_PRODUCTOS = Target.the("Botón Solicitud de Productos")
            .located(By.id("header-solicitud-productos"));
}
