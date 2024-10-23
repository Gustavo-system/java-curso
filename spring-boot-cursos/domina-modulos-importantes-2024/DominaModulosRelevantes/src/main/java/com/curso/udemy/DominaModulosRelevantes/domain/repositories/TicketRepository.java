package com.curso.udemy.DominaModulosRelevantes.domain.repositories;

import com.curso.udemy.DominaModulosRelevantes.domain.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<TicketEntity, Long> {
}
