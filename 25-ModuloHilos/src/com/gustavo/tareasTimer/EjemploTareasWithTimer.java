package com.gustavo.tareasTimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploTareasWithTimer {
    public static void main(String[] args) {
        // que se repita una tarea de forma periodica

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Timer timer = new Timer();
        AtomicInteger contador = new AtomicInteger(1);

        timer.schedule(new TimerTask() {
            // private int aux = 3;
            @Override
            public void run() {
                int aux = contador.getAndIncrement();
                if(aux <= 5){
                    toolkit.beep();
                    System.out.println("Tarea numero " + aux +
                            " ejecutada  las " + new Date() +
                            " del hilo " + Thread.currentThread().getName());
                    // aux--;
                }else{
                    System.out.println("Tarea finalizada.");
                    timer.cancel();
                }

            }
        }, 1000, 5000);

        System.out.println("Tareas programadas :");

    }
}
