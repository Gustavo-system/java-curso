package org.example.lists;

import java.util.List;

public class SuperHeroe {

    private String nombre;
    private List<String> poderes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "SuperHeroe{" +
                "nombre='" + nombre + '\'' +
                ", poderes=" + poderes +
                '}';
    }
}
