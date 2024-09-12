package com.gustavo.primeraApiRestSpringBoot.models;

import com.gustavo.primeraApiRestSpringBoot.dto.AutorDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String filosofia;

    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;

    public Autor() {}

    public Autor(AutorDTO autorDTO) {
        this.id = autorDTO.getId();
        this.nombre = autorDTO.getNombre();
        this.apellido = autorDTO.getApellido();
        this.edad = autorDTO.getEdad();
        this.filosofia = autorDTO.getFilosofia();
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

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
