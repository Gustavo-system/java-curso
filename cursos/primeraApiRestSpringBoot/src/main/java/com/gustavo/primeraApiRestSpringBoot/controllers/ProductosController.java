package com.gustavo.primeraApiRestSpringBoot.controllers;

import com.gustavo.primeraApiRestSpringBoot.beans.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController()
@RequestMapping(value = "/first-demo/api")
public class ProductosController {

    private static  final Logger log = LoggerFactory.getLogger(ProductosController.class);

    @GetMapping
    public String serverUp(){
        return "UP";
    }

    @GetMapping(value = "/productos")
    public List<Producto> getProductos(){
        return getProductosRegistrados();
    }

    @GetMapping(value = "/productos/{id}")
    public Producto getProducto(@PathVariable Integer id){
        for(Producto producto : getProductosRegistrados()){
            if(producto.getId() == id){
                return producto;
            }
        }

        return null;
    }

    @PostMapping(value = "/productos")
    public String registroProducto(@RequestBody Producto producto){
        log.info("entra al metodo de registro de producto {}", producto.toString());
        return "{'message': 'producto registrado con exito'}";
    }

    public List<Producto> getProductosRegistrados(){
        // ptra forma de declarar el array demo
        //List<Producto> listasProductos = new ArrayList<>();
        //listasProductos.add(new Producto(1, "Televicion", "Esto es una televicion", 20.0);

        return new ArrayList<>(Arrays.asList(
                new Producto(1, "Televicion", "Esto es una televicion", 20.0),
                new Producto(2, "Televicion 2", "Esto es una televicion", 20.0),
                new Producto(3, "Televicion 3", "Esto es una televicion", 20.0),
                new Producto(4, "Televicion 4", "Esto es una televicion", 20.0)
        ));
    }

}
