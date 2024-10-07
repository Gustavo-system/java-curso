package com.curso.udemy.DominaModulosRelevantes.domain.repositories;

import com.curso.udemy.DominaModulosRelevantes.domain.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
}
