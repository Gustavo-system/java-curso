package com.gustavo.primeraApiRestSpringBoot.service;

import com.gustavo.primeraApiRestSpringBoot.dto.LibroDTO;
import com.gustavo.primeraApiRestSpringBoot.factory.FabricaLibroService;
import com.gustavo.primeraApiRestSpringBoot.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private FabricaLibroService fabricaLibroService;

    @Autowired
    private LibroRepository libroRepository;

    public LibroDTO save(LibroDTO libroDTO){
        return fabricaLibroService.crearLibroDTO(libroRepository.save(fabricaLibroService.crearLibro(libroDTO)));
    }

    public List<LibroDTO> findAll(){
        return fabricaLibroService.crearLibrosDTO(libroRepository.findAll());
    }

    public LibroDTO findById(Integer id){
        return fabricaLibroService.crearLibroDTO(libroRepository.findById(id).get());
    }
}
