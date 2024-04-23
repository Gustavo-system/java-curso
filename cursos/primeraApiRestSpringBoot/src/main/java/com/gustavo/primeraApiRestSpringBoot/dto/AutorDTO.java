package com.gustavo.primeraApiRestSpringBoot.dto;

import com.gustavo.primeraApiRestSpringBoot.models.Autor;

public class AutorDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String filosofia;

    public AutorDTO() {
    }

    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nombre = autor.getNombre();
        this.apellido = autor.getApellido();
        this.edad = autor.getEdad();
        this.filosofia = autor.getFilosofia();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getFilosofia() {
        return filosofia;
    }

    public void setFilosofia(String filosofia) {
        this.filosofia = filosofia;
    }
}
