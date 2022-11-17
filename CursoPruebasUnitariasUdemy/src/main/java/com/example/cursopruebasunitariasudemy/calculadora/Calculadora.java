package com.example.cursopruebasunitariasudemy.calculadora;

public class Calculadora implements CalculadoraInterface{

    @Override
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    @Override
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

}
