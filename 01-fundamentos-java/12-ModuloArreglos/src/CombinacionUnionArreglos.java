public class CombinacionUnionArreglos {
    public static void main(String[] args) {

        // unir elementos de dos arreglos
        System.out.println("\nUnir elementos de dos arreglos\n");

        int iterador = 0, aux = 0;
        int[] arrayUno, arrayDos, arrayTres;

        arrayUno = new int[10];
        arrayDos = new int[10];
        arrayTres = new int[20];

        while (iterador < arrayUno.length) {
            arrayUno[iterador] = iterador + 10;
            iterador++;
        }

        for (int i = 0; i < arrayDos.length; i++) {
            arrayDos[i] = i + 20;
        }

        for (int i = 0; i < 10; i++) {
            arrayTres[aux++] = arrayUno[i];
            arrayTres[aux++] = arrayDos[i];
        }

        for (int i = 0; i < arrayTres.length; i++) {
            System.out.println("Elementos del array tres [" + i + "] " + "-> " + arrayTres[i]);
        }

        // unir dos arreglos con multiples elementos
        System.out.println("\nUnir dos arreglos con multiples elementos\n");

        int mayor = 0;
        int[] numeroMayor = {10, 2, 5, 8, 0, 4, 5, 73, 1, 123, 3423, 42, 34, 234, 242};

        for (int i = 0; i < numeroMayor.length; i++) {
            mayor = (numeroMayor[i] > mayor) ? numeroMayor[i] : mayor;
            System.out.println("mayor en el iterador [" + i + "] es ->" + mayor);
        }
        System.out.println("El numero mayor es -> " + mayor + "\n");


    }
}
