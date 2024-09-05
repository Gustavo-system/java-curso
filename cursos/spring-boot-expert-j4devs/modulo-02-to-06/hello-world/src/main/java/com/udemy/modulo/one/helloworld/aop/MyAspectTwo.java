package com.udemy.modulo.one.helloworld.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class MyAspectTwo {

    private static final Logger LOG = LoggerFactory.getLogger(MyAspectTwo.class);

    // // se define un apsecto para las clases
    // @Before("execution(* com.udemy.modulo.one.helloworld.aop.TarjetObject.*(..))")

    // // se implementa un pointcut
    @Before("ReutilizarPointcut.tarjetObjectReutilizandoPointcut()")
    public void before() {
        LOG.info("1 Before aspect advice - se ejecuta segun el orden");
    }

}
