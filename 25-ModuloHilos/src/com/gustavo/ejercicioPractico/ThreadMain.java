package com.gustavo.ejercicioPractico;

import com.gustavo.ejercicioPractico.runnable.ClienteThread;
import com.gustavo.ejercicioPractico.runnable.PanaderoThread;

public class ThreadMain {
    public static void main(String[] args) {

        Panaderia panaderia = new Panaderia();

        new Thread(new PanaderoThread(panaderia)).start();
        new Thread(new ClienteThread(panaderia)).start();
    }
}
