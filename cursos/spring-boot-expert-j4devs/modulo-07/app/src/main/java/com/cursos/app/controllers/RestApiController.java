package com.cursos.app.controllers;

import com.cursos.app.entities.Role;
import com.cursos.app.entities.User;
import com.cursos.app.services.RoleService;
import com.cursos.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/pruebas-java-persistence")
public class RestApiController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/roles")
    public ResponseEntity<List<Role>> getRoles(){
        return new ResponseEntity<>(roleService.getRoles(), HttpStatus.OK);
    }

    @PostMapping(value = "/roles")
    public ResponseEntity<Role> postRoles(@RequestBody(required = true) Role request){
        return new ResponseEntity<>(roleService.postRole(request), HttpStatus.OK);
    }

    @PutMapping(value = "/roles/{roleId}")
    public ResponseEntity<Role> postRoles(@PathVariable("roleId") Integer id, @RequestBody(required = true) Role request){
        return new ResponseEntity<>(roleService.updateRole(id, request), HttpStatus.OK);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{user_id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "user_id", required = true) Integer id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/usersByUsername/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable(value = "username") String username) {
        return new ResponseEntity<>(userService.getUserByUsername(username), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> createUser(@RequestBody() User request) {
        return new ResponseEntity<>(userService.createUser(request), HttpStatus.OK);
    }

}
