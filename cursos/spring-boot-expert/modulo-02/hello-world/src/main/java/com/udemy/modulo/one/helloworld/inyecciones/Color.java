package com.udemy.modulo.one.helloworld.inyecciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Color {
    /**
     * Inyeccion de dependencias por medio de getter and setter
     */
    private String color;

    private Integer densidad;

    private Proveedor proveedor;

    public Color(){}

    public Color(String color, Integer densidad, Proveedor proveedor) {
        this.color = color;
        this.densidad = densidad;
        this.proveedor = proveedor;
    }

    public String getColor() {
        return color;
    }

    @Value("DefaultColor")
    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDensidad() {
        return densidad;
    }

    @Value("200")
    public void setDensidad(Integer densidad) {
        this.densidad = densidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    @Autowired
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                ", densidad=" + densidad +
                ", proveedor=" + proveedor +
                '}';
    }
}
