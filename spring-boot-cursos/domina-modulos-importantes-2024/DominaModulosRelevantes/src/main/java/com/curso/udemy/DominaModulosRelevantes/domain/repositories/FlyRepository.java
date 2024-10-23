package com.curso.udemy.DominaModulosRelevantes.domain.repositories;

import com.curso.udemy.DominaModulosRelevantes.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * No es necesario anotar esta clase con @Repository ya que spring detecta que extiende un Repository
 */
public interface FlyRepository extends JpaRepository<FlyEntity, Long> {
}
