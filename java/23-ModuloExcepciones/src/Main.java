import com.curso.udemy.Calculadora;
import com.curso.udemy.DivicionPorZeroException;

public class Main {
    public static void main(String[] args) { // se puede propagar tambien la exception a este nivel
        System.out.println("Manejo de Exceptions!");

        Calculadora calculadora = new Calculadora();

        try{
            double resultadoDivicion = calculadora.dividir(10, 0);
            System.out.println(resultadoDivicion);
        }catch (DivicionPorZeroException divicionPorZeroException){
            System.out.println("catch de la divicion: " + divicionPorZeroException.getMessage());
        }

    }
}