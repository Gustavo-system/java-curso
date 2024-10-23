package com.curso.udemy.DominaModulosRelevantes.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "ticket")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private LocalDate purchaseDate;

    /**
     * Especificamos las relaciones
     * Muchos tickets pueden pertenecer a un vuelo
     */
    @ManyToOne
    @JoinColumn(name = "fly_id") // En el @JoinColumn se coloca el campo con el que se hace la relacion en nuestro diagrama
    private FlyEntity fly;

    @ManyToOne
    @JoinColumn(name = "tour_id", nullable = true)
    private TourEntity tour;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;


}
