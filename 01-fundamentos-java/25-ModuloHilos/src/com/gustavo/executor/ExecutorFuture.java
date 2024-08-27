package com.gustavo.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea");
            try {
                System.out.println("nombre del hilo" + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        };

        System.out.println("Inicio del metodo main");
        Future<?> resultadoFuturo = executorService.submit(tarea); // retorna un future
        executorService.shutdown(); // espera que todas las tareas terminen

        System.out.println("La tarea termimo -> " + resultadoFuturo.isDone()); // retorna false por que aun no termina la tarea


    }
}
