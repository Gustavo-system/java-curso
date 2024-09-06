public class EjemploAgregarEliminarElementosArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sizeArray = numeros.length;
        int posicionEliminar = 5; // se elimina el numero 6

        for (int i = posicionEliminar; i < sizeArray - 1; i++) {
            numeros[i] = numeros[i + 1];
        }

        for (int i = 0; i < sizeArray; i++) {
            System.out.println("numeros[" + i + "] " + numeros[i]);
        }

        // copiamos a otro arreglo
        int[] nuevosNumeros = new int[sizeArray - 1];

        System.arraycopy(numeros, 0, nuevosNumeros, 0, nuevosNumeros.length);

        System.out.println();
        for (int i = 0; i < nuevosNumeros.length; i++) {
            System.out.println("nuevosNumeros[" + i + "] " + numeros[i]);
        }


        // agregar elementos de forma dinamica
        System.out.println();
        int[] otrosNumeros = new int[10];
        int posicion = 6, ultimo, nuevoNumero = 1110;

        for (int i = 0; i < otrosNumeros.length; i++) {
            otrosNumeros[i] = i + 1;
        }

        ultimo = otrosNumeros[otrosNumeros.length - 1];
        for (int i = otrosNumeros.length - 2; i >= posicion; i--) {
            otrosNumeros[i + 1] = otrosNumeros[i];
        }

        int[] nuevosNumerosDos = new int[otrosNumeros.length + 1];

        System.arraycopy(otrosNumeros, 0, nuevosNumerosDos, 0, otrosNumeros.length);

        nuevosNumerosDos[posicion] = nuevoNumero;
        nuevosNumerosDos[nuevosNumerosDos.length - 1] = ultimo;

        for (int i = 0; i < nuevosNumerosDos.length; i++) {
            System.out.println("indice[" + i + "] = " + nuevosNumerosDos[i]);
        }


    }
}
