package com.udemy.modulo.one.helloworld.inyecciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {
    /**
     * Inyeccion de dependencias por medio de constructor
     */
    private String marca;
    private String modelo;
    private Color color;

    /**
     * se elimina el constructor vacio para poder hacer la inyeccion de dependencia
     * public Motor(){}
     */
    @Autowired
    public Motor(@Value("DefaultMarca") String marca, @Value("DefaultModldeo") String modelo, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    @Autowired
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                '}';
    }
}
