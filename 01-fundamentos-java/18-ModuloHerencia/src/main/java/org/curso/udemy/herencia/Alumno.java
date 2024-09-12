package org.curso.udemy.herencia;

public class Alumno extends Persona {

    private double promedio;
    private String salon;
    private String carrera;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return String.format(" { 'alumno' : { 'promedio' : %s , 'salon' : %s , 'carrera': %s }, %s }", promedio, salon, carrera, super.toString());
    }
}
