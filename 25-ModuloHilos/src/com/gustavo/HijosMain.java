package com.gustavo;

import com.gustavo.runnable.NombreThreadInterface;
import com.gustavo.thread.NombreThread;

public class HijosMain {
    public static void main(String[] args) {
        Thread hilo1 = new NombreThread("Primer Hilo"); // hilo creado extendiendo de la clase Thread
        //new Thread(new NombreThreadInterface("Segundo Hilo")).start(); // hilo creado con la interfaz de Runnable
        Thread hilo2 = new Thread(new NombreThreadInterface("Segundo Hilo"));
        /*
        - Los hijos se ejecuntan segun el start
        - Si se le pone algun Sleep cambia la forma de ejecución
        - getState() retorna el estado en el que encuentra el hijo, Terminado, esperando, run, etc.
         */
        hilo1.start();
        System.out.println("Estado Hilo Uno -> " + hilo1.getState());
        hilo2.start();
        System.out.println("Estado Hilo Dos -> " + hilo2.getState());


    }
}
