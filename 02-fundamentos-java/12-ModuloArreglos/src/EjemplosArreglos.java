import java.util.Arrays;
import java.util.Collections;

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


        // recorriendo arreglo con otro tipo de bucle
        int[] edades = {21,23,45,67,87};
        int countArray = edades.length;
        int contador = 0;
        while (contador < countArray){
            System.out.println("Con while - Edad en la posicion " + contador + " del array edades = " + edades[contador]);
            contador ++;
        }

        int contadorDos = 0;
        do{
            System.out.println("Con do-while - Edad en la posicion " + contador + " del array edades = " + edades[contadorDos]);
            contadorDos++;
        }while (contadorDos < countArray);


        // llenar un arreglo de numeros
        int[] arrayNumeros = new int[10];
        int countNumeros = arrayNumeros.length;
        for (int i = 0; i < countNumeros; i++){
            arrayNumeros[i] = i + 1;
        }

        for (int numero : arrayNumeros) {
            System.out.println("numeros del array vacio y ahora esta lleno " + numero);
        }


        // invertir arreglos
        for (int i = 0; i < countArray; i++){
            System.out.println("imprimiendo las edades pero a la inversa con logica en posicion " + edades[countArray - 1 - i]);
        }

        for (int i = countArray - 1; i >= 0; i--){ // se coloca -1 por el el countArray tiene un indice que no esta en el array 5 - pero es 4
            System.out.println("imprimiendo las edades pero a la inversa con logica en condicion " + edades[i]);
        }

        for (int i = 0; i < count/2; i++){
            String actual = arrayDesordenado[i];
            String ultimo = arrayDesordenado[count-1-i];
            arrayDesordenado[i] = ultimo;
            arrayDesordenado[count-1-i] = actual;
        }

        for (String nombre : arrayDesordenado) {
            System.out.println("nombres invertidos = " + nombre);
        }


        // dando vueltas al arreglo
        String[] arrayInvertido = ordenarArray(nombres);
        for (String item : arrayInvertido) {
            System.out.println("array revertido con un metodo -> item = " + item);
        }


        // usando clases propias de java
        Collections.reverse(Arrays.asList(nombres));
        for (String item : nombres) {
            System.out.println("array revertido con Collections.reverse -> item = " + item);
        }

    }

    // implementando un metodo para revertir un array
    public static String[] ordenarArray (String[] array){
        int countItems = array.length;
        for (int i = 0; i < countItems/2; i++){
            String actual = array[i];
            String ultimo = array[countItems -1 -i];
            array[i] = ultimo;
            array[countItems -1 -i] = actual;
        }
        return array;
    }
}
