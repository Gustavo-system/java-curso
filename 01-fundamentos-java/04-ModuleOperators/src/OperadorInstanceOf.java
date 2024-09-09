public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Texto de una instancia string";

        // Integer num = new Integer(7);
        Integer num = 7;

        boolean esTipoString = texto instanceof String;
        System.out.println("texto es de intancia String " + esTipoString);

        // genera un error en automatico
        //boolean esTipoStirngNum = num instanceof String;


        boolean esTipoStirng2 = num instanceof Object;
        System.out.println("num es de intancia Objeto " + esTipoStirng2);

        boolean esTipoNumber = num instanceof Number;
        System.out.println("num es de intancia Number " + esTipoNumber);

        boolean esTipoInteger = num instanceof Integer;
        System.out.println("num es de intancia Number " + esTipoInteger);

    }
}
