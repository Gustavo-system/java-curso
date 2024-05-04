package com.udemy.modulo.one.helloworld.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplicitBeen {

    private static final Logger LOG = LoggerFactory.getLogger(ExplicitBeen.class);

    /**
     * Se ejecutara despues de las inyeccion de las dependencias
     */
    @PostConstruct
    public void init(){
        LOG.info("Post construct Explicit Been");
    }

    /**
     * Los metodos con la anotacion de PreDestroy se ejecutaran antes de que el been sea destruido
     * No se ejecuta para beans prototype
     * Solo se ejcuta durante una finalizacion de la VM de forma manual
     */
    @PreDestroy
    public void destroy(){
        LOG.info("Pre destroy Explicit Been");
    }
}
