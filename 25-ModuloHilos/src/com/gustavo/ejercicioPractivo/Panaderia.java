package com.gustavo.ejercicioPractivo;

// Recurso compartido por los hilos
public class Panaderia {
    private String nombrePan;
    private boolean disponible;


    // no se puede usar el wait() ni notify() si no tiene synchronized
    public synchronized void hornear(String nombrePan){
        while (this.disponible){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.nombrePan = nombrePan;
        System.out.println("-> El panadero esta horneando el pan : " + this.nombrePan);
        this.disponible = true;
        notify();
    }

    public synchronized String consumir(){
        while (!this.disponible){
            try{
                wait();
                System.out.println("-> El cliente se esta esperando un pan");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("-> El cliente se esta comiendo el pan : " + this.nombrePan);
        this.disponible = false;
        notify();
        return this.nombrePan;
    }
}
