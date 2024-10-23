package com.curso.udemy.DominaModulosRelevantes.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", length = 50)
    private String fullName;
    @Column(name = "credit_card", length = 20)
    private String creditCard;
    private Integer totalFlights;
    private Integer totalLodgings;
    private Integer totalTours;
    @Column(length = 12)
    private String phoneNumber;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "customer"
    )
    private Set<TicketEntity> tickets;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "customer"
    )
    private Set<ReservationEntity> reservations;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "customer"
    )
    private Set<TourEntity> tours;

}
