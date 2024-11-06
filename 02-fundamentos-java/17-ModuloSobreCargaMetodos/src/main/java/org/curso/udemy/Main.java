package org.curso.udemy;

import org.curso.udemy.calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculadora calculadora = new Calculadora();

        System.out.println("suma int 1 = "+ calculadora.sumar(2, 2));
        System.out.println("suma int 2 = "+ calculadora.sumar(2, 2, 2));
        System.out.println("suma float 3 = "+ calculadora.sumar(2.0, 2.0));

        // utilizanco metodos staticos
        System.out.println("suma argumentos indefinidos y como metodo static " + Calculadora.sumar(2,2,3,4,6,10));

    }
}