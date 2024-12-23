package org.example.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class utileriaJson {

    public static <T> T jsonAObjeto(String resultado, Class<T> objeto) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return objectMapper.readValue(resultado, objeto);
        } catch (IOException e) {
            throw new Exception("Incidencia al convertir a Objeto.");
        }
    }

}
