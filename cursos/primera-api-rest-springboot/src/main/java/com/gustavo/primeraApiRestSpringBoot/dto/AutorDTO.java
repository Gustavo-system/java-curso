package com.gustavo.primeraApiRestSpringBoot.dto;

import com.gustavo.primeraApiRestSpringBoot.models.Autor;
import com.gustavo.primeraApiRestSpringBoot.models.Libro;

import java.util.ArrayList;
import java.util.List;

public class AutorDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String filosofia;

    private List<LibroDTO> libros;

    public AutorDTO() {
    }

    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nombre = autor.getNombre();
        this.apellido = autor.getApellido();
        this.edad = autor.getEdad();
        this.filosofia = autor.getFilosofia();

        this.libros = new ArrayList<>();
        autor.getLibros().forEach(libro -> this.libros.add(new LibroDTO(libro)));
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

    public List<LibroDTO> getLibrosDTO() {
        return libros;
    }

    public void setLibrosDTO(List<LibroDTO> libros) {
        this.libros = libros;
    }
}
