package com.udemy.modulo.one.helloworld.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(value = "pajarito")
@Primary // se coloca este para hacer referencia al qualifier y no se necesite especificar si no lo toma como por default
public class Pajaro extends Animal implements Acciones {

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("Pajaro loco") String nombre, @Value("1") Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        log.info("Soy un pajaro y estoy volando");
    }

}
