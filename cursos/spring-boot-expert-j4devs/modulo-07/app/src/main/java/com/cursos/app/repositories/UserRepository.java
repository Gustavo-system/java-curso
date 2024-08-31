package com.cursos.app.repositories;

import com.cursos.app.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Se realiza el paginado, ya que extiende de la interfaz JpaRepository -> ListPagingAndSortingRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * Se implementa un metodo para filtrar solo por usenname, spring se encarga de hacerlo solo es cosa de definirlo
     * @param username
     * @return
     */
    Optional<User> findByUsername(String username);

    /**
     * Esto no es SQL es JPQL
     * @return retorna solo los usernames
     */
    @Query("SELECT u.username FROM User as u")
    //@Query("SELECT u.username FROM User as u WHERE u.username like '%2'")
    public Page<String> getAllUsersOnlyUsernames(Pageable pageable);


}
