package com.gustavo.primeraApiRestSpringBoot.models;

import com.gustavo.primeraApiRestSpringBoot.dto.LibroDTO;
import jakarta.persistence.*;

@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    @ManyToOne
    private Autor autor;

    public Libro() {}

    public Libro(LibroDTO libroDTO) {
        this.id = libroDTO.getId();
        this.nombre = libroDTO.getNombre();
        this.descripcion = libroDTO.getDescripcion();
        this.autor = new Autor(libroDTO.getAutorDTO());
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
