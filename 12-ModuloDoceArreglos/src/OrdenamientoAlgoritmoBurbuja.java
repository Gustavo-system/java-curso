public class OrdenamientoAlgoritmoBurbuja {
    /*
        Algoritmo para ordenar un array de forma manual, a este metodo se le conoce como burbuja,
        es simple pero no muy optimizado
     */
    public static void main(String[] args) {
        String[] nombres = {"Chanchito", "Feliz", "Borreguito", "Triste", "Alegre", "Burbuja", "Algoritmo", "Ordenamiento"};

        int iteraciones = 0;
        int sizeArray = nombres.length;

        for (int i = 0; i < sizeArray; i++){
            for (int j = 0; j < sizeArray; j++){
                if(nombres[i].compareTo(nombres[j]) < 0){
                    String aux = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = aux;
                }
                iteraciones++;
            }
        }

        System.out.println("numero de iteraciones que se hacen para poder ordenar el array = " + iteraciones);

        for (String nombre : nombres) {
            System.out.println("nombre del array Nombres ordenado = " + nombre);
        }
    }
}
