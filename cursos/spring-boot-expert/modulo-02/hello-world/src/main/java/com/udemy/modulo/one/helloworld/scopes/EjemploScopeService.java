package com.udemy.modulo.one.helloworld.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") // crea una nueva instancia cada vez que se solicite singleton
public class EjemploScopeService {

}
