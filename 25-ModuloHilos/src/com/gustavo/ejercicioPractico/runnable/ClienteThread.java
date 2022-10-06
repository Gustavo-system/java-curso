package com.gustavo.ejercicioPractico.runnable;

import com.gustavo.ejercicioPractico.Panaderia;

public class ClienteThread implements Runnable {

    private Panaderia panaderia;

    public ClienteThread(Panaderia panaderia){
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            panaderia.consumir();
        }
    }
}
