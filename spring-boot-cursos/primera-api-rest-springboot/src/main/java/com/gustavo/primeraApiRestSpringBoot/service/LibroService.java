package com.gustavo.primeraApiRestSpringBoot.service;

import com.gustavo.primeraApiRestSpringBoot.dto.LibroDTO;
import com.gustavo.primeraApiRestSpringBoot.factory.FabricaAutorService;
import com.gustavo.primeraApiRestSpringBoot.factory.FabricaLibroService;
import com.gustavo.primeraApiRestSpringBoot.models.Autor;
import com.gustavo.primeraApiRestSpringBoot.repository.AutorRepository;
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
    @Autowired
    private FabricaAutorService fabricaAutorService;

    @Autowired
    private AutorRepository autorRepository;

    public LibroDTO save(LibroDTO libroDTO){
        try{
            Autor autor = autorRepository.findById(libroDTO.getIdAutor()).get();
            libroDTO.setAutorDTO(fabricaAutorService.crearAutorDTO(autor));
            return fabricaLibroService.crearLibroDTO(libroRepository.save(fabricaLibroService.crearLibro(libroDTO)));
        }catch (Exception e){
            return null;
        }

    }

    public List<LibroDTO> findAll(){
        return fabricaLibroService.crearLibrosDTO(libroRepository.findAll());
    }

    public LibroDTO findById(Integer id){
        return fabricaLibroService.crearLibroDTO(libroRepository.findById(id).get());
    }
}
