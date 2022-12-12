package com.curso.udemy;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        try{
            String numero1 = JOptionPane.showInputDialog("Ingrese un valor para dividir el 10");
            int divisor = Integer.parseInt(numero1);

            // aqui ejecutamos la logica que podria dar una exception
            int resultado = 10 / divisor;
            System.out.println(resultado);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Ingrese un numero : " + numberFormatException.getMessage());
            main(args);
        } catch (ArithmeticException arithmeticException){ // es mejor definir la exception que se desea capturar de forma especifica
            // Capturamos la exception que nos pueda surgir
            System.out.println("Surguio un problema: " + arithmeticException.getMessage());
        } finally {
            // aqui se pine el bloque de codigo que se ejecuta si o si aunque surja una exception
            System.out.println("Se ejecuta la accion si o si: " );
        }

        System.out.println("Continuamos con el flujo del programa");
    }
}
