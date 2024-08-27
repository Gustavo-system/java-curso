package com.gustavo.primeraApiRestSpringBoot.repository;

import com.gustavo.primeraApiRestSpringBoot.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Integer> {
}
