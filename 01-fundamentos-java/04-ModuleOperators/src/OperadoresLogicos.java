public class OperadoresLogicos {
    public static void main(String[] args) {
        /**
         * Se pueden valir dos distintas condiciones
         * AND y OR
         *
         * AND: si una exprecion es false retorna un falso, se utiliza el doble amperson &&
         * OR: si todas las expresiones son falsas retorna un falso, se utiliza la doble linea ||
         */
        int i = 3;
        byte j = 7;
        int k = 8;

        System.out.println("i es igual a j y k es mayor que j " + (i == j && k > j));

        System.out.println("i es menor a j y i es mayor que k " + (i < j && i > k));


    }
}
