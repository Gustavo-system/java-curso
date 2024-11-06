import javax.swing.*;
import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{

            // Get number by System
            System.out.println("Enter a number please: ");
            int anotherNumber = Integer.parseInt(scanner.nextLine());

            // Get number by Interface
            int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number please: "));
            System.out.println("this is your number: " + number);

            String message = "Number in binary: " + Integer.toBinaryString(number) + "\n" + "Number in Octal: " + Integer.toOctalString(number) + "\n" + "Number in Hexadecimal: " + Integer.toHexString(number) + "\n";
            JOptionPane.showMessageDialog(null, message);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter only a number Integer");
            main(args);
            System.exit(0);
        }

    }
}
