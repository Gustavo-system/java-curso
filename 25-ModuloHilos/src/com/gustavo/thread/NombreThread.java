package com.gustavo.thread;

public class NombreThread extends Thread{

    /*
    Extendemos de la clase Thread
    podemos sobrescribir metodos para poder ejecutar los metodos heredados del Thread
    Se puede sobre escribir el metodo contructor del Thread para poder asignarle un nombre
     */

    public NombreThread(String nombre){
        super(nombre);
    }

    /*
    Cunado incia el metodo run() se esta ejectuando ya el hilo, y cuando se salga o termina fuere el hilo
     */
    @Override
    public void run(){
        System.out.println("se inicia el hilo -> " + this.getName());

        for (int i = 0; i < 10; i++){
            System.out.println("Hilo -> " + this.getName());
        }


        System.out.println("se termina el hilo con Thread-> " + this.getName());
    }
}

