package com.gustavo.solar;

import com.gustavo.solar.hogar.Hogar;

public class Main {
    public static void main(String[] args) {

        /*
         - La forma de importar paquetes se puede hacer por el nombre completo o por medio de un import
         import com.gustavo.solar.Prueba -> se importa el nombre arriba de la clase con un import
         com.gustavo.solar.Prueba prueba = new com.gustavo.solar.Prueba() -> se importa por el nombre completamente calificado
         - tambien se pueden importar de forma estatica
         import static com.gustavo.solar.Prueba.saludar -> se utiliza para importar medodos estaticos de una clase
         */

        com.gustavo.solar.hogar.Hogar hogar2 = new com.gustavo.solar.hogar.Hogar();
        hogar2.setName("Hotel");

        Hogar hogar = new Hogar();
        hogar.setName("Casa");

    }
}