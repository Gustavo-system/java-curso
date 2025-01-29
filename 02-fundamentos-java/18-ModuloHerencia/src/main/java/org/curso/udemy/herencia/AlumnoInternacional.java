package org.curso.udemy.herencia;

public class AlumnoInternacional extends Alumno {
    private String paisOrigen;
    private String tiempo;

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return String.format("'alumnoExtrangero' : { 'paisOrigen' : %s, 'tiempo' : %s }, {'herencia' : %s}", paisOrigen, tiempo, super.toString());
    }
}
