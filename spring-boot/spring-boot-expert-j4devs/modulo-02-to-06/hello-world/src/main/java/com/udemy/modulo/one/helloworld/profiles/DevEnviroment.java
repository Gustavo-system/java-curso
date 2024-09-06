package com.udemy.modulo.one.helloworld.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = {"dev", "default"}) // se define un perfil por defecto
public class DevEnviroment implements EnviromentService {
    @Override
    public String getEnviroment() {
        return "DEV";
    }
}
