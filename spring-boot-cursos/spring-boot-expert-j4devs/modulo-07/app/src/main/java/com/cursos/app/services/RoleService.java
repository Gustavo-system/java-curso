package com.cursos.app.services;

import com.cursos.app.customexeptions.MessageException;
import com.cursos.app.entities.Role;
import com.cursos.app.repositories.RoleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
        if(true) {
            throw new RuntimeException();
        }

        // si la interfaz hereda de CrudRepository retornamos un iterable
        // si la interfaz hereda de JpaRepository ya nos da una lista
        return roleRepository.findAll();
    }

    public Role postRole(Role role) {
        return roleRepository.save(role);
    }

    /**
     * la anotacion @Cacheable() es para que no se este consultando la base de datos en cada peticion y optimizar el proceso
     */
    @Cacheable("roles")
    public Role getRoleById(Integer id) {
        return roleRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El rol indicado no existe %s", id))
        );
    }

    public Role updateRole(Integer id, Role request) {
        Optional<Role> result = roleRepository.findById(id);
        if(result.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Role id $d no existe", id));
        }

        return roleRepository.save(request);
    }

}
