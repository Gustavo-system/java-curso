import java.util.function.BiFunction;
import java.util.function.Function;

public class Funciones {
    public static void main(String[] args) {
        System.out.println("FUnciones lambda!");

        // funciones en lambdas
        // estas funciones reciben y retornan un valor
        Function<String, String> function0 = (String param) -> {
            return "Hola" + param;
        };
        String response = function0.apply("Chanchito");
        System.out.println("response -> " + response);

        // se pueden simplificar de la siguente manera
        Function<String, String> funcion1 = param -> "hola" + param;
        String responseCorto = funcion1.apply("Chanchito 2");
        System.out.println("response 2 -> " + responseCorto);

        // usamos el BiFunction para pasar dos argumentos a la lambda y el valor de retorno
        // los dos primeros tipos de datos que se pasa es de los parametros
        // el tercer tipo de parametro que se pasa es el de retorno
        BiFunction<String, Number, String> function3 = (String nombre, Number edad) -> {
            return "Hola " + nombre + " felices " + edad;
        };
        System.out.println(function3.apply("Borreguito", 23));

        // simplificando la funcion de arriba
        BiFunction<String, Number, String> function3_1 = (nombre, edad) -> "Hola " + nombre + " felices " + edad;
        System.out.println(function3_1.apply("Borreguito 2", 23));

    }
}
