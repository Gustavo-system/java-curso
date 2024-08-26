package com.cursos.app.controllers;

import com.cursos.app.entities.Role;
import com.cursos.app.services.RoleService;
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

}
