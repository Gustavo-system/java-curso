package com.udemy.modulo.one.helloworld.aop.practica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MetodosGenericos {

    private static final Logger LOG = LoggerFactory.getLogger(MetodosGenericos.class);

    @CoustomAnotationParams
    public String convertAllToUpperCase(String text) {
        LOG.info("convertAllToUpperCase te saluda -> {}", text);
        return text;
    }
}
