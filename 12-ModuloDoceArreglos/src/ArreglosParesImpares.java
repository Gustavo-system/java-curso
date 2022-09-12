import java.util.Scanner;

public class ArreglosParesImpares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int logitud = 0, totalPares = 0, totalImpares = 0, auxPares = 0, auxImpares = 0;
        int[] numeros, impares, pares;

        try {
            System.out.print("Ingrese la logitude de numeros que desea: _");
            logitud = Integer.parseInt(leer.nextLine());
        } catch (Exception e) {
            System.out.println("ingrese un numero\n");
            main(args);
        }

        numeros = new int[logitud];

        System.out.println("Ingrese los valores");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("-> ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }

        for (int numero : numeros) {
            if ((numero % 2) == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[auxPares++] = numeros[i];
            } else {
                impares[auxImpares++] = numeros[i];
            }
        }

        System.out.print("pares : ");
        for (int par : pares) {
            System.out.print(par + ", ");
        }

        System.out.print("\r\nimpares : ");
        for (int impar : impares) {
            System.out.print(impar + ", ");
        }


    }
}
