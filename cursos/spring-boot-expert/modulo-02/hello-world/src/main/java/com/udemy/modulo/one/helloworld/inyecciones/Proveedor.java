package com.udemy.modulo.one.helloworld.inyecciones;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Proveedor {
    /**
     * Clase con valores en los getter y setter para ser inyectados por medio de los mismos
     */
    private String nombre;

    public Proveedor() {}

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Value("NombreProveedorDefault")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
