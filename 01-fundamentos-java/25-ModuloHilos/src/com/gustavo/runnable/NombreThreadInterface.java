package com.gustavo.runnable;

public class NombreThreadInterface implements Runnable{
    /*
    - con esta forma de hacerlo podemos ectender de otra clase
    - se puede usar en una herencia de clases y no esta sujeta solo al Thread
     */

    private String nombre;

    public NombreThreadInterface(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public void run(){

        System.out.println("Inicia hilo -> " + this.getNombre());

        for(int i = 0; i < 10; i++){
            System.out.println("Nombre hilo interfaz -> " + this.getNombre());
        }

        System.out.println("Termina la ejecucion del hilo con Runnable.");
    }
}
