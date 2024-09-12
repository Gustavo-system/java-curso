package com.udemy.modulo.one.helloworld.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(value = 0)
@Component
public class MyAspect {

    private static final Logger LOG = LoggerFactory.getLogger(MyAspect.class);

    /**
     * Se declara un aspecto unicamente para un metodo de una clase.
     */
    /*
    @Before("execution(* com.udemy.modulo.one.helloworld.aop.TarjetObject.hello(..))")
    public void before() {
        LOG.info("Before aspect advice");
    }
    */

    /**
     * Se declara un aspect para todos los metodos de una clase
     * @param joinPoint con los argumentos
     */
    // @Before("execution(* com.udemy.modulo.one.helloworld.aop.TarjetObject.*(..))")
    @Before("ReutilizarPointcut.tarjetObjectReutilizandoPointcut()")
    public void showNameMethodBefore(JoinPoint joinPoint) {
        LOG.info("0 - Before aspect advice class name -> {}", joinPoint.getSignature().getName());
        LOG.info("0 - Before aspect advice argumentos {}", joinPoint.getArgs());
    }

}
