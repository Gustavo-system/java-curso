import javax.swing.*;

public class Operators {
    public static void main(String[] args) {

        // declare variables if they are of the same type
        int i = 4, j =3;
        String name = "Gustavo", lastname = "Solar";
        boolean flagRed = true, flagBlue = false;

        /*
            Arithmetic operators
        */
        System.out.println("** Arithmetic operators **");

        int numeroUno = Integer.parseInt( JOptionPane.showInputDialog(null, "Enter the first number : ") );
        int numeroDos = Integer.parseInt( JOptionPane.showInputDialog(null, "Enter the second number : "));

        // Suma: +
        int operacion = numeroUno + numeroDos;
        System.out.println("Suma : " + operacion);
        // Resta: -
        System.out.println("Resta : " + (operacion - 13));
        // Multiplicacion: *
        System.out.println("Multiplicacion : " + (operacion * 5));
        // Divicion: /
        System.out.println("Divicion : " + (operacion / 2));
        // Modulo: %
        boolean resto = (operacion % 2) == 0;
        System.out.println("Modulo -> es par el numero? : " + resto);


        /*
            assignment operators
        */
        System.out.println("\n** Assignment Operators **");

        int number2 = numeroUno + numeroDos;
        number2 += numeroUno;
        System.out.println("suma asignacion : " + number2);

    }
}
