package com.cursos.app.services;

import com.cursos.app.entities.Role;
import com.cursos.app.repositories.RoleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRespository roleRepository;

    public List<Role> getRoles() {
        // si la interfaz hereda de CrudRepository retornamos un iterable
        // si la interfaz hereda de JpaRepository ya nos da una lista
        return roleRepository.findAll();
    }

    public Role postRole(Role role) {
        return roleRepository.save(role);
    }

    public Role updateRole(Integer id, Role request) {
        Optional<Role> result = roleRepository.findById(id);
        if(result.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Role id $d no existe", id));
        }

        return roleRepository.save(request);
    }

}