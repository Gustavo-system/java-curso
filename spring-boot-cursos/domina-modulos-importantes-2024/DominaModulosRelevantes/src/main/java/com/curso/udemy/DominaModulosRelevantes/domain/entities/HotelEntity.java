package com.curso.udemy.DominaModulosRelevantes.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

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

    @OneToMany(
            cascade = CascadeType.ALL, // eliminar los registros en cascada
            fetch = FetchType.EAGER, // se especifica como sera la carga de los datos en este caso solo hasta que se invoque
            orphanRemoval = true, // elimina un objeto en caso de que no tenga una llave foranea
            mappedBy = "hotel" // mapeo de como se llama el campo en la relacion
    )
    private Set<ReservationEntity> reservation;

}
