package com.curso.udemy.DominaModulosRelevantes.domain.entities;

// las nuevas versiones de spring ahora se importan de jakarta
import com.curso.udemy.DominaModulosRelevantes.utils.AeroLine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Se utiliza para que la entidad se pueda volver en bites y se inserte ne la base de datos
 * en versiones actuales de spring ya no es necesario
 * import java.io.Serializable;
 *
 * implements Serializable
 */

/**
 * anotaciones de lombok
 * @Data : define los contructores getter, setters, hashequals, toString
 * @NoArgsConstructor : indicamos que la anotacion @Data el constructor no tenga argumentos y sea un constructor vacio
 * @Builder : Para hacer la construccion de objetos pero necesitamos un constructor con argumentos
 * @AllArgsConstructor : Indicamos que un contructor del @Builder tenga todos los argumentos
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor

// definimos que sea un entidad y el nombre de la tabla con la que hara referencia
@Entity(name = "fly")
public class FlyEntity  {

    // TODA ENTIDAD DEBE TENER UN CONSTRUCTOR VACIO

    /**
     * Definimos el id de la tabla
     * @Id es la propiedad que se utiliza siempre para definir el identificador de los registros, es necesario siempre que se define @Entity
     * @GeneratedValue esta anotacion se utiliza para que el spring haga el manejo de id y generarlo segun la strategia
     * la estrategia GenerationType.IDENTITY se utiliza para Postgrest
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * - Para los campos de las tablas no es necesario agregar en cada atributos la anotacion @Column
     * - cuando esta en una entidad spring lo mapea de forma automatica
     * - cuando el nombre del campo es distinto si se debe agregar la anotacion @Column
     */
    @Column(name = "origin_lat")
    private Double originLat;

    @Column(name = "origin_lng")
    private Double originLng;

    @Column(name = "destiny_lat")
    private Double destiny_lat;

    @Column(name = "destiny_lng")
    private Double destinyLng;

    private BigDecimal price;

    @Column(name = "origin_name", length = 20)
    private String originName;

    @Column(name = "destiny_name", length = 20)
    private String destinyName;

    /**
     * cuando el tipo de dato de una Entity es un Enumerador se debe agregar la anotacion @Enumerated para que no de error en la base de datos
     * y se le indica en el parametro que tipo de dato hara la conversion EnumType.STRING
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "aero_line", length = 20)
    private AeroLine aeroLine;

    @OneToMany(
            cascade = CascadeType.ALL, // eliminar los registros en cascada
            fetch = FetchType.EAGER, // se especifica como sera la carga de los datos en este caso solo hasta que se invoque
            orphanRemoval = true, // elimina un objeto en caso de que no tenga una llave foranea
            mappedBy = "fly" // mapeo de como se llama el campo en la relacion, es el nombre del campo en la otra clase
    )
    private Set<TicketEntity> tickets;

}
