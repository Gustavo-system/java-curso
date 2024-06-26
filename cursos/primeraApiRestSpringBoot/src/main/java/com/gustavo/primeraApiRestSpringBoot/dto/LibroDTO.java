package com.gustavo.primeraApiRestSpringBoot.dto;

import com.gustavo.primeraApiRestSpringBoot.models.Libro;

public class LibroDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private AutorDTO autor;
    private Integer idAutor;

    public LibroDTO() {}

    public LibroDTO(Libro libro) {
        this.id = libro.getId();
        this.nombre = libro.getNombre();
        this.descripcion = libro.getDescripcion();
        //this.autor = new AutorDTO(libro.getAutor());
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public AutorDTO getAutorDTO() {
        return autor;
    }

    public void setAutorDTO(AutorDTO autor) {
        this.autor = autor;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }
}
