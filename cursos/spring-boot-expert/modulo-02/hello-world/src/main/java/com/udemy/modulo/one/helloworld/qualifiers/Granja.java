package com.udemy.modulo.one.helloworld.qualifiers;

import com.udemy.modulo.one.helloworld.HelloWorldApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Granja {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldApplication.class);

    @Autowired
    @Qualifier("pajarito")
    private Animal animal;

    public void imprimirInfo(){
        log.info("Objeto animal: nombre {} edad {}", animal.getNombre(), animal.getEdad());
    }
}
