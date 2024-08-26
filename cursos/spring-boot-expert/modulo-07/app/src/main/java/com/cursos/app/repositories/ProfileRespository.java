package com.cursos.app.repositories;

import com.cursos.app.entities.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRespository extends CrudRepository<Profile, Integer> {
}
