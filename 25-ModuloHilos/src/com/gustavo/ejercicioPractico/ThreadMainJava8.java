package com.gustavo.ejercicioPractico;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadMainJava8 {

    public static void main(String[] args) {

        Panaderia panaderia = new Panaderia();

        /*
        - Se hace con expresiones lambda
        */
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                panaderia.hornear("Pan numero " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 5000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                panaderia.consumir();
            }
        }).start();

    }

}
