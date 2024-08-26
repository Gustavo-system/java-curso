package com.cursos.app.controllers;

import com.cursos.app.models.User;
import com.cursos.app.services.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Stereotipo que define que es una api rest
@RequestMapping("/api/v1")
public class UsuariosController {

    @Autowired
    private UserService userService;

    @GetMapping("/up")
    public String up(){
        return "Hola mundo";
    }

    //@GetMapping("/users")
    @RequestMapping(method = RequestMethod.GET, path = "/users") // una forma adicional para definir el recurso
    public ResponseEntity<List<User>> get(){
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("/users/filter")
    public ResponseEntity<List<User>> filterUsers(@RequestParam(value = "inicial", required = false) String inicial){
        return new ResponseEntity<>(userService.filterUser(inicial), HttpStatus.OK);
    }

    @GetMapping(path = "/users/{id}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @PostMapping(path = "/users")
    public ResponseEntity<User> postUser(@RequestBody User request){
        return new ResponseEntity<>(userService.createUser(request), HttpStatus.CREATED);
    }

    @PutMapping(path = "/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User request){
        return new ResponseEntity<>(userService.updateUser(id, request), HttpStatus.OK);
    }

    @DeleteMapping(path = "/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
