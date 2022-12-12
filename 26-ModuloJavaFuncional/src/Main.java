import Models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java 8 Funcional !");

        // Consumer no retorna ningun valor

        // se pueden omitir las llaves cuando es solo una istrucción, de lo contrario podemos usar las llaves {}
        Consumer<String> saludar = nombre -> System.out.println("Hola " + nombre);
        saludar.accept("Chanchito");

        Consumer<Date> formatoFecha = (Date fecha) -> {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("La fecha es " + format.format(fecha));
        };
        formatoFecha.accept(new Date());

        // Existe el BiConsumer para pasar dos parametros
        BiConsumer<String, Integer> datosPersonales = (String nombre, Integer edad) -> {
            System.out.println("Hola, mi nombres es " + nombre + " tengo " + edad + " años.");
        };
        datosPersonales.accept("Gustavo", 23);

        // la funcion de arriba se puede hacer en una sola linea
        BiConsumer<String, Integer> datosPersonales2 = (nombre, edad) -> System.out.println("Hola, mi nombres es " + nombre + " tengo " + edad + " años.");
        datosPersonales2.accept("Ana", 23);

        // se pasa por argumento en la función lambda una variable, se puede simplificar
        Consumer<String> consumer = mensaje -> System.out.println(mensaje); // asi se haria normalmente
        consumer.accept("Hola lambda normal");
        Consumer<String> consumer1 = System.out::println; // asi se pasa por referencia simplificado
        consumer1.accept("Hola lambda simplificada");

        // ejemplo de funciones por referencia
        List<String> nombres = Arrays.asList("Chanchito", "Borreguito", "Pejelagarto");
        nombres.forEach(consumer1); // se imprime uno por uno los nombres

        // ejemplo de funciones por referencia
        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = (Usuario persona, String nombre) -> {
            persona.setNombre(nombre);
        };
        asignarNombre.accept(usuario, "Cuchaw");
        System.out.println("El nombre del usuario es: " + usuario.getNombre());

        // forma simplificada de hacer la funcion de arriba es:
        Usuario usuario1 = new Usuario();
        BiConsumer<Usuario, String> asignarNombre2 = Usuario::setNombre;
        asignarNombre2.accept(usuario1, "El tunas");
        System.out.println("El nombre del usuario es: " + usuario1.getNombre());



        // Supplier no recibe argumentos pero si retorna un valor
        Supplier<String> getMensage = () -> {
            return "Hola mundo lambda supplier";
        };
        System.out.println(getMensage.get());

        // tambien existe una forma corta de realizar esta lambda
        Supplier<String> getMensage2 = () -> "Hola mundo lambda supplier simplificado";
        System.out.println(getMensage2.get());

    }
}