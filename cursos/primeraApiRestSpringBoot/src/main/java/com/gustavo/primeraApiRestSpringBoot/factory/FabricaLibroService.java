package com.gustavo.primeraApiRestSpringBoot.factory;

import com.gustavo.primeraApiRestSpringBoot.dto.LibroDTO;
import com.gustavo.primeraApiRestSpringBoot.models.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaLibroService {
    public Libro crearLibro(LibroDTO libroDTO){
        return new Libro(libroDTO);
    }

    public LibroDTO crearLibroDTO(Libro libro){
        return new LibroDTO(libro);
    }

    public List<LibroDTO> crearLibrosDTO(List<Libro> libroList){
        List<LibroDTO> libroDTOS = new ArrayList<>();
        libroList.forEach(libro -> libroDTOS.add(crearLibroDTO(libro)));
        return libroDTOS;
    }

}
