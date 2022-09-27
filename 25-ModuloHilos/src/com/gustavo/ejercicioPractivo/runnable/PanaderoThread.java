package com.gustavo.ejercicioPractivo.runnable;

import com.gustavo.ejercicioPractivo.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class PanaderoThread implements Runnable{

    private Panaderia panaderia;

    public PanaderoThread(Panaderia panaderia){
        this.panaderia = panaderia;
    }

    @Override
    public void run() {

        // logica del hilo
        for(int i = 0; i < 10; i++){
            panaderia.hornear("Pan numero " + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
