package com.gustavo.ejercicioPractivo;

import com.gustavo.ejercicioPractivo.runnable.ClienteThread;
import com.gustavo.ejercicioPractivo.runnable.PanaderoThread;

public class ThreadMain {
    public static void main(String[] args) {

        Panaderia panaderia = new Panaderia();

        new Thread(new PanaderoThread(panaderia)).start();
        new Thread(new ClienteThread(panaderia)).start();
    }
}
