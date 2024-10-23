package com.curso.udemy.DominaModulosRelevantes.domain.repositories;

import com.curso.udemy.DominaModulosRelevantes.domain.entities.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}
