package com.curso.udemy;

public class DivicionPorZeroException extends Exception {
    // aplicamos el constructor para poder tener un mensaje personalizado
    public DivicionPorZeroException(String mensaje){
        super(mensaje);
    }
}
