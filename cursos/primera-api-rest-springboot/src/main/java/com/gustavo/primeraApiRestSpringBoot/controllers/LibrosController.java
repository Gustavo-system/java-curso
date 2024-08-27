package com.gustavo.primeraApiRestSpringBoot.controllers;

import com.gustavo.primeraApiRestSpringBoot.dto.LibroDTO;
import com.gustavo.primeraApiRestSpringBoot.service.LibroService;
import com.gustavo.primeraApiRestSpringBoot.utils.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo/api")
public class LibrosController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public ResponseEntity<GeneralResponse> getAll(){
        return new ResponseEntity<>(GeneralResponse.builder().setResultado(libroService.findAll()).build(), HttpStatus.OK);
    }

    @PostMapping("/libros")
    public ResponseEntity<GeneralResponse> create(@RequestBody LibroDTO request){
        return new ResponseEntity<>(GeneralResponse.builder().setResultado(libroService.save(request)).build(), HttpStatus.CREATED);
    }

    @GetMapping("/libros/{id}")
    public ResponseEntity<GeneralResponse> getById(@PathVariable Integer id){
        try{
            return new ResponseEntity<>(GeneralResponse.builder().setResultado(libroService.findById(id)).build(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(GeneralResponse.builder().setMensaje("No hay registros").build(), HttpStatus.NOT_FOUND);
        }
    }

}
