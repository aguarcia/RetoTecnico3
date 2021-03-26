package com.bancolombia.web.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.bancolombia.web.userinterface.BancolombiaInicialPage.OPC_PERSONAS;
import static com.bancolombia.web.userinterface.BancolombiaPersonas.BUTTON_SOLICITUD_PRODUCTOS;
import static com.bancolombia.web.userinterface.BancolombiaSolicitudProductos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarProductosInversion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPC_PERSONAS),
                Click.on(BUTTON_SOLICITUD_PRODUCTOS),
                Click.on(BUTTON_INVERSIONES),
                Click.on(BUTTON_AMPLIAR),
                Click.on(BUTTON_MONTO_500),
                Click.on(LINK_CONOCE_MAS)
        );

    }

    public static NavegarProductosInversion navegarProductosInversion(){
        return instrumented(NavegarProductosInversion.class);
    }
}
