package com.cursos.app.services;

import com.cursos.app.models.User;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuariosService {

    private static final Logger LOG = LoggerFactory.getLogger(UsuariosService.class);

    @Autowired
    private Faker faker;

    /*
     * Condigo para mi servicio
     */
    private List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        for (int i = 0; i < 10; i++) {
            users.add(new User(i + 1, faker.funnyName().name(), faker.name().username(), faker.dragonBall().character()));
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserById(Integer id) {
        return users.stream().filter(
                user -> user.getId().equals(id)
        ).findAny().orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("USER %s NOT FOUND", id))
        );
    }

    public User createUser(User user) {
        int lastIndex = users.size() - 1;
        int lastId = users.get(lastIndex).getId();
        int id = lastId + 1;
        users.add(new User(id, user.getNickname(), user.getUsername(), user.getPassword()));
        /*
         * user.setId(id);
         * users.add(user);
         */
        return users.get(id - 1);
    }

    public User updateUser(Integer id, User user) {
        User userDataFind = getUserById(id);

        userDataFind.setNickname(user.getNickname());
        userDataFind.setUsername(user.getUsername());
        userDataFind.setPassword(user.getPassword());

        return userDataFind;
    }

    public void deleteUser(Integer id) {
        User user = getUserById(id);
        users.remove(user);
        //users.removeIf(item -> item.getId().equals(id));
    }

    public List<User> filterUser(String inicial){
        /*if(username == null || username.equals("")){
            return users;
        }*/
        if (Strings.isEmpty(inicial)){
            return users;
        }

        return users.stream().filter(item -> item.getUsername().startsWith(inicial)).toList();
    }

}
