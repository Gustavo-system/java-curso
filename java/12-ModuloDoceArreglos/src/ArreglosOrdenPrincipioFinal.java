public class ArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int sizeArray, auxiliar = 0, iterador = 0;
        int[] numeros = new int[10];

        sizeArray = numeros.length;

        // se puede hacer con un for pero quise hacerlo con un while
        while (iterador < sizeArray) {
            numeros[iterador] = iterador + 10;
            iterador++;
        }

        int[] arrayPrincipioFinal = new int[sizeArray];

        for (int i = 0; i < sizeArray / 2; i++) {
            arrayPrincipioFinal[auxiliar++] = numeros[i];
            arrayPrincipioFinal[auxiliar++] = numeros[sizeArray - 1 - i];

            System.out.print("Inicio " + numeros[i] + " final " + numeros[sizeArray - 1 - i] + "\n");
        }

        System.out.print("\nArray principio-final\n");
        for (int i = 0; i < arrayPrincipioFinal.length; i++) {
            System.out.println("Posicion [" + i + "] " + arrayPrincipioFinal[i]);
        }
    }
}
