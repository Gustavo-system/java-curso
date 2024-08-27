package com.gustavo;

public class EjemploHilosRunnable {
    /*
    - Ejemplo de Hilos con la interface Runnable
    - Implementado de forma funcional los hilos
     */
    public static void main(String[] args) throws InterruptedException {

        // con funciones anominas
        Runnable hilo = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inicia hilo -> " + Thread.currentThread().getName());

                for(int i = 0; i < 10; i++){
                    System.out.println("Nombre hilo interfaz -> " + Thread.currentThread().getName());
                }

                System.out.println("Estado -> " + Thread.currentThread().getState());
                System.out.println("Termina la ejecucion del hilo con Runnable. " + Thread.currentThread().getName());
            }
        };

        // formas de instanciar un hilo
        new Thread(hilo, "Hilo 1").start();

        Thread hilo2 = new Thread(hilo, "Hilo 2");
        hilo2.start();


        // con funciones lambda
        Runnable hilo3 = () -> {
            System.out.println("Inicia hilo -> " + Thread.currentThread().getName());

            for (int i = 0; i < 10; i++) {
                System.out.println("Nombre hilo interfaz -> " + Thread.currentThread().getName());
            }
            System.out.println("Estado -> " + Thread.currentThread().getState());
            System.out.println("Termina la ejecucion del hilo con Runnable. " + Thread.currentThread().getName());
        };

        new Thread(hilo3, "Hilo 3").start();

        Thread hilo4 = new Thread(hilo3, "Hilo 4");
        hilo4.start();
        hilo4.join();
        //Thread.sleep(1000);

        System.out.println("continuando con la ajecucion del metodo main");


    }
}
