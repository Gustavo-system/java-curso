package com.curso.udemy;

public class Calculadora {

    public double dividir(int divisor, int dividendo) throws  DivicionPorZeroException{ // propagamos la exception
        if (dividendo == 0){
            // lanzamos una exception checkeada... al momento de hacer la definición del metedo
            throw new DivicionPorZeroException("No se puede divir en entre zero.");
        }
        // continuamos el flujo de nuestro programa
        return divisor / (double)dividendo;
    }

}
