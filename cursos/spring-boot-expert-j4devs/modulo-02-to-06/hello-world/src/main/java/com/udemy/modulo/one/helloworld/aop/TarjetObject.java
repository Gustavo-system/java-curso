package com.udemy.modulo.one.helloworld.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TarjetObject {

    private static final Logger LOG = LoggerFactory.getLogger(TarjetObject.class);

    @CoustomAnnotation
    public void hello() {
        LOG.info("TarjetObject te saluda");
    }

    @CoustomAnnotation
    public void parseString(String message) {
        LOG.info("TarjetObject - parseString - parametro {}", message);
    }

}
