package com.gustavo;

import com.gustavo.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) {
        new Thread(new ImprimirFrases("Hola", "chanchito feliz")).start();
        new Thread(new ImprimirFrases("chanchito", "feliz")).start();
        new Thread(new ImprimirFrases("adios", "chanchito :)")).start();
    }

    // se agrega synchronized para que los hilos se vayan esperando
    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1 + " ");

        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(frase2);
    }
}
