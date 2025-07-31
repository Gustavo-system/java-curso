package com.cursos.app.services;

import com.cursos.app.entities.User;
import com.cursos.app.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    // inyeccion de dependencias por contructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        Optional<User> result = userRepository.findById(id);
        if (result.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    String.format("El usuario con id $d no encontrado", id));
        }

        return result.get();
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        String.format("usuario no encontrado $d", username)));
    }

    public Page<User> getUsersPaginator(int page, int size) {
        return userRepository.findAll(PageRequest.of(page, size));
    }

    public Page<String> getUserNames(int page, int size) {
        return userRepository.getAllUsersOnlyUsernames(PageRequest.of(page, size));
    }

    public User createUser(User request) {
        return userRepository.save(request);
    }
}
