package com.udemy.modulo.one.helloworld.aop.practica;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CoustomAspect {

    private static final Logger LOG = LoggerFactory.getLogger(CoustomAspect.class);

    @Around("@annotation(CoustomAnotationParams)")
    public Object convertToStringUpperCase(ProceedingJoinPoint joinPoint) throws Throwable {
        LOG.info("signature ejecutar el metodo '{}'", joinPoint.getSignature().getName());
        LOG.info("Procesor ejecutar el metodo '{}'", joinPoint.proceed());
        LOG.info("Argumentos ejecutar el metodo '{}'", joinPoint.getArgs());

        Object result = joinPoint.proceed();

        if(result instanceof String) {
            return ((String) result).toUpperCase();
        }

        return result;
    }

}
