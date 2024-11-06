public class OperadoresRelacionales {
    public static void main(String[] args) {
        /**
         * Los operadores relacionales se utilizan con == cuando son tipos primitivos
         * se utiliza .equals cuando se trata de un tipo objeto
         */
        int i = 3;
        byte j = 7;

        System.out.println("i es igual a j " + (i == j));

        // con el signo de ! antes de las variables booleanas se invirte el valor
        System.out.println("invirtiendo el valor " + !(i == j));

        System.out.println("i es distinto de j " + (i != j));

        System.out.println("i es mayor a j " + (i > j));

        System.out.println("i es menor a j " + (i < j));

        System.out.println("i es mayor o igual a j " + (i >= j));

        System.out.println("i es meno o igual a j " + (i <= j));

    }
}
