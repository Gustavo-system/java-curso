package com.gustavo.runnable;

import static com.gustavo.EjemploSincronizacionThread.imprimirFrases; // otra forma de importar metodos estaticos

public class ImprimirFrases implements Runnable {

    private String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2){
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        // aqui se mete la logica del hilo
        // EjemploSincronizacionThread.imprimirFrases(frase1, frase2);
        imprimirFrases(frase1, frase2);
    }
}
