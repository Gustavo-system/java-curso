package com.gustavo.primeraApiRestSpringBoot.controllers;

import com.gustavo.primeraApiRestSpringBoot.dto.AutorDTO;
import com.gustavo.primeraApiRestSpringBoot.service.AutorService;
import com.gustavo.primeraApiRestSpringBoot.utils.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/demo/api")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/autores")
    public ResponseEntity<GeneralResponse> getAll(){
        return new ResponseEntity<>(GeneralResponse.builder().setResultado(autorService.findAll()).build(), HttpStatus.OK);
    }

    @PostMapping("/autores")
    public ResponseEntity<GeneralResponse> create(@RequestBody AutorDTO request){
        return new ResponseEntity<>(GeneralResponse.builder().setResultado(autorService.save(request)).build(), HttpStatus.OK);
    }

    @GetMapping("/autores/{id}")
    public ResponseEntity<GeneralResponse> getById(@PathVariable Integer id){
        try{
            return new ResponseEntity<>(GeneralResponse.builder().setResultado(autorService.findById(id)).build(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(GeneralResponse.builder().setMensaje("No hay registros").build(), HttpStatus.NOT_FOUND);
        }
    }

}
