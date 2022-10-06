package com.gustavo.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {
    public static void main(String[] args) throws InterruptedException {

        // EjecutorService nos retorna un Future y podemos manipular su estado
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

        System.out.println("Inicio del metodo main : ");
        executorService.submit(tarea); // se lanza la el hilo pero si solo se queda asi no se termina
        executorService.shutdown(); // espera que todas las tareas terminen
        //executorService.awaitTermination(5, TimeUnit.SECONDS); //esperar el tiempo indicado y asi continua con el proceso
        System.out.println("Continua con el metodo main.");

    }
}
