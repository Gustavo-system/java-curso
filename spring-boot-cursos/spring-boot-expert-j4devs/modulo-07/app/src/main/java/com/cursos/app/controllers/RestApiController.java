package com.cursos.app.controllers;

import com.cursos.app.entities.Role;
import com.cursos.app.entities.User;
import com.cursos.app.services.RoleService;
import com.cursos.app.services.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public ResponseEntity<List<Role>> getRoles() {
        return new ResponseEntity<>(roleService.getRoles(), HttpStatus.OK);
    }

    @GetMapping(value = "/roles/{role_id}")
    public ResponseEntity<Role> getRoleById(@PathVariable(value = "role_id") Integer id) {
        return new ResponseEntity<>(roleService.getRoleById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/roles")
    public ResponseEntity<Role> postRoles(@RequestBody(required = true) Role request) {
        return new ResponseEntity<>(roleService.postRole(request), HttpStatus.OK);
    }

    @PutMapping(value = "/roles/{roleId}")
    public ResponseEntity<Role> postRoles(@PathVariable("roleId") Integer id,
            @RequestBody(required = true) Role request) {
        return new ResponseEntity<>(roleService.updateRole(id, request), HttpStatus.OK);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{user_id}")
    @ApiOperation(value = "Retorna un usuario por id", response = User.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operacion exitosa"),
            @ApiResponse(code = 404, message = "No se encontro informacion del usuario")
    })
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

    /**
     * Para evitar errores en la peticion se deben agregar los valor de require y defaulValue, en caso de que no se le envien esos valores en la peticion
     * @param page
     * @param size
     * @return Retorna un Tipo Page
     */
    @GetMapping(value = "/users/paginator")
    public ResponseEntity<Page> getUsersPaginator(
            @RequestParam(value = "page", required = false, defaultValue = "0") int page,
            @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
        return new ResponseEntity<>(userService.getUsersPaginator(page, size), HttpStatus.OK);
    }

    @GetMapping(value = "/users/usernames")
    public ResponseEntity<Page> getUserNames(
            @RequestParam(value = "page", required = false, defaultValue = "0") int page,
            @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
        return new ResponseEntity<>(userService.getUserNames(page, size), HttpStatus.OK);
    }

}
