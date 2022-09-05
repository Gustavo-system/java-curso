public class PasarPorValor {

    /*
        Pasar argumentos por valor
     */

    public static void main(String[] args) {
        int numeroUno = 10;
        System.out.println("iniciamos el metodo main " + numeroUno);
        test(numeroUno);
        System.out.println("fin del metodo main con valor de numeroUno " + numeroUno);
    }

    public static void test(int numeroUno){
        System.out.println("iniciamos el metodo test " + numeroUno);
        numeroUno = 20;
        System.out.println("Fin del metodo test con valor de numeroUno = " + numeroUno);
    }
}
