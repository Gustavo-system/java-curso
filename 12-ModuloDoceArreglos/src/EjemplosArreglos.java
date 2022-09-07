import java.util.Arrays;

public class EjemplosArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[3];

        // se asignan valores despues de instanciar el arreglo
        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 6;


        // se instancia el arreglo ya con valores
        String[] nombres = {"Hola", "mundo", "Chanchito", "feliz"};

        int count = nombres.length;

        for (int i = 0; i < count; i++){
            System.out.println("nombres[" + i + "]" + nombres[i]);
        }


        // ordenar arreglos con sort()
        String[] arrayDesordenado = {"Chanchito", "Feliz", "Borreguito", "Triste"};
        Arrays.sort(arrayDesordenado); // se importa de java.util
        for (String palabra:arrayDesordenado) {
            System.out.println("palabras del array desoredenado ahora ordenado con sort() = " + palabra);
        }

    }
}
