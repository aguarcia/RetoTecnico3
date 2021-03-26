package com.bancolombia.web.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaInversionVirtual {

    public static final Target BUTTON_DOCUMENTOS = Target.the("Botón opción de documentos")
            .located(By.xpath("//section[@id=\"tabs\"]//li[4]//a"));

    public static final Target BUTTON_REGLAMENTO_INVERSION_DESCARGA = Target.the("Botón de descarga del documento")
            .located(By.xpath("//button[@class=\"c-download-rules\"]//a"));
}
