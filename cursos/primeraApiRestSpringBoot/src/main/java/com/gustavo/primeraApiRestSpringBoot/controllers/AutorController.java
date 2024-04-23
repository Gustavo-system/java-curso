package com.gustavo.primeraApiRestSpringBoot.controllers;

import com.gustavo.primeraApiRestSpringBoot.dto.AutorDTO;
import com.gustavo.primeraApiRestSpringBoot.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/demo/api")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/autores")
    public ResponseEntity<List<AutorDTO>> getAll(){
        return new ResponseEntity<>(autorService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/autores")
    public ResponseEntity<AutorDTO> save(@RequestBody AutorDTO request){
        return new ResponseEntity<>(autorService.save(request), HttpStatus.OK);
    }

    @GetMapping("/autores/{id")
    public ResponseEntity<AutorDTO> getById(@PathVariable Integer id){
        return new ResponseEntity<>(autorService.findById(id), HttpStatus.OK);
    }

}
