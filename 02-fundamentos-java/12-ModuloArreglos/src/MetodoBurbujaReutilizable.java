public class MetodoBurbujaReutilizable {

    // para hacer metodos genericos al no saber que tipo de dato se pasara por parametro
    // usamos la clase Object
    public static Object[] metodoBurburja(Object[] arrayOrdenar) {
        int sizeArray = arrayOrdenar.length;
        int count = 0;

        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < (sizeArray - 1); j++) {
                if (((Comparable) arrayOrdenar[j + 1]).compareTo(arrayOrdenar[j]) < 0) { // queremos cambiar el orden solo modificar el < a >
                    Object aux = arrayOrdenar[j];
                    arrayOrdenar[j] = arrayOrdenar[j + 1];
                    arrayOrdenar[j + 1] = aux;
                }
                count++;
            }
        }

        System.out.println("\nSe hicieron " + count + " iteraciones para ordenar un arreglo de " + sizeArray + " elementos");
        return arrayOrdenar;
    }

    public static void main(String[] args) {

        String[] nombres = {"Chanchito", "Feliz", "Borreguito", "Triste", "Alegre", "Burbuja", "Algoritmo", "Ordenamiento"};
        Object[] arrayNombresOrdenado = metodoBurburja(nombres);

        for (Object item : arrayNombresOrdenado) {
            System.out.println("elemento del array Nombres = " + item);
        }


        // para el caso de pasar el primitivo int marca un error, asi que se debe pasar a un tipo Integer el array
        // int[] edades = {21,23,45,67,87}; // -> de esta forma falla
        Integer[] edades = {14, 7, 4, 45, 76, 89, 12, 5, 13};
        Object[] arrayEdadesOrdenado = metodoBurburja(edades);

        for (Object item : arrayEdadesOrdenado) {
            System.out.println("elemento del array Edades = " + item);
        }

    }
}
