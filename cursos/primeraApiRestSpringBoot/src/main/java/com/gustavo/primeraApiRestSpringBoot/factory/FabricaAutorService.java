package com.gustavo.primeraApiRestSpringBoot.factory;

import com.gustavo.primeraApiRestSpringBoot.dto.AutorDTO;
import com.gustavo.primeraApiRestSpringBoot.models.Autor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaAutorService {

    public Autor crearAutor(AutorDTO autorDTO){
        return new Autor(autorDTO);
    }

    public AutorDTO crearAutorDTO(Autor autor){
        return new AutorDTO(autor);
    }

    public List<AutorDTO> crearAutoresDTO(List<Autor> autorList){
        List<AutorDTO> autorDTOS = new ArrayList<>();
        autorList.forEach(autor -> autorDTOS.add(crearAutorDTO(autor)));
        return autorDTOS;
    }

}
