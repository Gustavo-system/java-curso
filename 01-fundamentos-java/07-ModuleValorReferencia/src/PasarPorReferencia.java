public class PasarPorReferencia {
    /*
        Pasar valores por referencia
     */

    public static void main(String[] args) {
        System.out.println("inicia el metodo main");

        int[] numeros = {1,2,3,4,5,6,7,8,9};

        int size = numeros.length;

        for(int i = 0; i < size; i++){
            System.out.println("numeros[" + i + "] : " + numeros[i]);
        }

        test(numeros);

        // arreglo modificacdo
        System.out.println("imprime el arreglo modificado");
        for(int i = 0; i < size; i++){
            System.out.println("numeros_modificados[" + i + "] : " + numeros[i]);
        }

        System.out.println("finaliza el metodo main");
    }

    public static void test(int[] arrayNumeros){
        System.out.println("inicia el metodo test, modifica el arreglo");
        for(int i = 0; i < arrayNumeros.length; i++){
            arrayNumeros[i] += 10;
        }
        System.out.println("finaliza el metodo test, modificó el arreglo");
    }
}
