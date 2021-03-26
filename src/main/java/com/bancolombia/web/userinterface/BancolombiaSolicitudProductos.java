package com.bancolombia.web.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaSolicitudProductos {

    public static final Target BUTTON_INVERSIONES = Target.the("Botón de Productos de Inversiones")
            .located(By.id("filtro-inversiones"));

    public static final Target BUTTON_AMPLIAR = Target.the("Botón para ampliar las opciones de inversion")
            .located(By.id("mostrar-filtros"));

    public static final Target BUTTON_MONTO_500 = Target.the("Botón para ampliar las opciones de inversion")
            .located(By.id("tag-catMontoMinimo500000"));

    public static final Target LINK_CONOCE_MAS = Target.the("Enlace a conocer mas del producto")
            .located(By.id("filtrado-conoce-inversion-0"));
}
