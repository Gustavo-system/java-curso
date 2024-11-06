package org.curso.udemy;

import org.curso.udemy.herencia.Alumno;
import org.curso.udemy.herencia.Profesor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Herencia el la programacion orientada a objetos!");

        /*
         * podriamos crear el objeto invocando a la clase padre
         * pero se debe realizar un cast a la clase hija
         * Persona alumno = new Alumno();
         *
         * para seguir accediento a los atributos de la clase hija se debe hacer un cast
         * ((Alumno) alumno).setSalon("2A");
         */
        Alumno alumno = new Alumno();
        alumno.setNombre("Chanchito");
        alumno.setApellido("Feliz");
        System.out.println("------------ Alumno que hereda de persona " + alumno);


        Profesor profesor = new Profesor();
        profesor.setNombre("Borreguito");
        profesor.setEdad(30);
        profesor.setAsignatura("Sistemas Computacionales");
        profesor.setScore(4.5);
        System.out.println("------------ Profesor que hereda de persona" + profesor);

    }
}