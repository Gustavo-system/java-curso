package com.curso.udemy.DominaModulosRelevantes.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_reservation")
    private LocalDateTime dateReservation;

    @Column(name = "date_start")
    private LocalDate dateStart;

    @Column(name = "date_end")
    private LocalDate dateEnd;

    @Column(name = "total_days")
    private Integer totalDays;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;

    @ManyToOne
    @JoinColumn(name = "tour_id", nullable = true)
    private TourEntity tour;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;


}
