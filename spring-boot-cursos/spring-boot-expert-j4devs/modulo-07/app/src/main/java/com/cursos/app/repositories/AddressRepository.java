package com.cursos.app.repositories;

import com.cursos.app.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // se le puede poner un estereotipo para indicar que tipo de clase es
public interface AddressRepository extends CrudRepository<Address, Integer> {
    /*
    * cuando se coloca el Extends y es de CrudRepository 
    * necesitamos informar el tipo y el tipo del id
    */
}
