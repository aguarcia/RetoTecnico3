package com.bancolombia.web.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.bancolombia.web.userinterface.BancolombiaInversionVirtual.BUTTON_DOCUMENTOS;
import static com.bancolombia.web.userinterface.BancolombiaInversionVirtual.BUTTON_REGLAMENTO_INVERSION_DESCARGA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDescargaReglamento implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_DOCUMENTOS),
                Click.on(BUTTON_REGLAMENTO_INVERSION_DESCARGA)
        );
    }

    public static SeleccionarDescargaReglamento seleccionarDescargaReglamento(){
        return instrumented(SeleccionarDescargaReglamento.class);
    }
}
