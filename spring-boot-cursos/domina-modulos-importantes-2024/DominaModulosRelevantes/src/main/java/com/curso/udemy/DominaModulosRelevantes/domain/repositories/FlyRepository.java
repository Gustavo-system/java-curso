package com.curso.udemy.DominaModulosRelevantes.domain.repositories;

import com.curso.udemy.DominaModulosRelevantes.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.Set;

/**
 * No es necesario anotar esta clase con @Repository ya que spring detecta que extiende un Repository
 */
public interface FlyRepository extends JpaRepository<FlyEntity, Long> {

    /**
     * Implementando query personalizadas
     * para utilizar alguna query por default de spring visitar esta liga
     * https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
     */
    @Query("SELECT f FROM fly AS f WHERE f.price < :price")
    Set<FlyEntity> selectLessPrice(@Param("price") BigDecimal price);

    @Query("SELECT f FROM fly AS f WHERE f.price BETWEEN :min AND :max")
    Set<FlyEntity> selectBetweenPrice(@Param("min") BigDecimal min, @Param("max") BigDecimal max);

    @Query("SELECT f FROM fly AS f WHERE f.originName = :origin AND f.destinyName = :destiny")
    Set<FlyEntity> selectOriginDestiny(@Param("origin") String origin, @Param("max") String destiny);

}
