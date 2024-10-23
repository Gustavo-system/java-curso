package com.curso.udemy.DominaModulosRelevantes.domain.repositories;

import com.curso.udemy.DominaModulosRelevantes.domain.entities.TourEntity;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<TourEntity, Long> {
}
