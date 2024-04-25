package com.udemy.modulo.one.helloworld.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Avion implements Acciones {

    private static final Logger log = LoggerFactory.getLogger(Avion.class);

    @Override
    public void volar() {
        log.info("Soy un avion y estoy volando");
    }
}
