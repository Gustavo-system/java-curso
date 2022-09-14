public class EjemploDesplazarPosicion {
    public static void main(String[] args) {
        // desplazar un numero una posicion
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sizeArray = numeros.length;

        System.out.println("\narreglo incial");
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        for (int i = 0; i < sizeArray; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[sizeArray - 1];
            numeros[sizeArray - 1] = aux;
        }

        System.out.println("\narreglo recorrido una posicion");
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // agregar un elemento dentro del arreglo y recorrer el resto
        int[] arrayNumeros = new int[10];
        int posicion = 0, numeroAgregar = -1;
        int lenArray = arrayNumeros.length;

        for (int i = 0; i < lenArray - 1; i++) {
            arrayNumeros[i] = i * 10 / 2;
        }

        while (posicion < lenArray && numeroAgregar > arrayNumeros[posicion]) {
            posicion++;
        }

        /*
        Esta es la manera tradicional de hacerlo

        for (int i = lenArray - 2; i >= posicion; i--) {
            arrayNumeros[i + 1] = arrayNumeros[i];
        }
        */

        if (lenArray - 1 - posicion >= 0)
            System.arraycopy(arrayNumeros, posicion, arrayNumeros, posicion + 1, lenArray - 1 - posicion);

        arrayNumeros[posicion] = numeroAgregar;

        for (int num : arrayNumeros) {
            System.out.println("num = " + num);
        }


    }
}
