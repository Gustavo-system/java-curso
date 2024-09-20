package com.curso.udemy.DominaModulosRelevantes.utils;

public enum AeroLine {
    AERO_GOLD("aero_gold"),
    BLUE_SHY("blue_shy");

    private final String nombre;

    AeroLine(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

}
