package com.udemy.modulo.one.helloworld.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy // este estereotipo hace que se ejecute cuando se mande a llamar el bean, por default son singleton
@Lazy(value = false) // esto hace que sea un been eager y por default se inicializa cuando arranca la app (singleton)
public class LifeCycleBeen implements BeanNameAware {

    private static final Logger LOG = LoggerFactory.getLogger(LifeCycleBeen.class);

    @Override
    public void setBeanName(String name) {
        LOG.info("Been name {}", name);
    }

    /*
     * Estos no deben recibir ningun argument y tampoco un valor como retorno
     * porque no se asigaria a nada
     */
    @PostConstruct
    public void init(){ LOG.info("Post construct with annotated"); }

    @PreDestroy
    public void destroy(){
        LOG.info("Pre destroy with annotated");
    }
}
