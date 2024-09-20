package com.curso.udemy.DominaModulosRelevantes.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "hotel")
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * - Para los campos de las tablas no es necesario agregar en cada atributos la anotacion @Column
     * - cuando esta en una entidad spring lo mapea de forma automatica
     * - cuando el nombre del campo es distinto si se debe agregar la anotacion @Column
     */
    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String address;

    private Integer rating;
    private BigDecimal price;

}
