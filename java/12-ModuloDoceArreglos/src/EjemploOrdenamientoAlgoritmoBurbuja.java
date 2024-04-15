import java.util.Scanner;

public class EjemploOrdenamientoAlgoritmoBurbuja {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tamanio = 0, contador = 0;

        try {

            System.out.println("Cuantos numero deseea ordenar? ");
            tamanio = Integer.parseInt(entrada.nextLine());

        } catch (Exception e) {
            System.out.println("ingrese un valor numerico, please.");
            main(args);
        }

        int[] arrayNumeros = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            System.out.println("intgrese un numero: ");
            arrayNumeros[i] = Integer.parseInt(entrada.nextLine());
        }

        for (int numero : arrayNumeros) {
            System.out.println("numeros en el array de numeros = " + numero);
        }

        // metodo burbuja
        int sizeArray = arrayNumeros.length;
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < (sizeArray - 1); j++) {
                if (arrayNumeros[j] > arrayNumeros[j + 1]) { // si numero actual es mayor a numero siguiente
                    int aux = arrayNumeros[j];
                    arrayNumeros[j] = arrayNumeros[j + 1];
                    arrayNumeros[j + 1] = aux;
                }
                contador++;
            }
        }

        // mostrando resultados
        System.out.println("\nnumero de iteraciones que se dieron para ordenar " + contador + "\n");

        for (int numero : arrayNumeros) {
            System.out.println("numeros en el array ya ordenados " + numero);
        }

    }
}
