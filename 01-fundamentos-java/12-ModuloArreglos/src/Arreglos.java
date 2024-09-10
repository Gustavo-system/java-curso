import java.util.Arrays;

public class Arreglos {
    /*
        La declaracion de un arreglo cuenta de dos partes
        1. El tipo de dato del arreglo seguido de corchetes []
        2. El nombre del arreglo

        La creacion del arreglo consta de
        1. se utiliza el operador new
        2. El tipo de elementos que se tendra
        3. La cantidad de elementos que se tendran
     */

    public static void main(String[] args) {

        // se intancia solo el array
        int[] numeros = new int[3];
        // se asignan los valores
        numeros[0] = 2;
        numeros[1] = 3; // se no se le asigna un valor pasa a 0 en los int y Null en los String
        numeros[2] = 10;

        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }

        // se instancia el objeto y se le asignan los valores
        int[] numerosDos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numerosDos.length; i++) {
            System.out.println("numerosDos[" + i + "]" + numerosDos[i]);
        }

    }

}
