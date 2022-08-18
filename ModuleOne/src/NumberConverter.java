import javax.swing.*;

public class NumberConverter {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number please: "));
        System.out.println("this is your number: " + number);

        String message = "Number in binary: " + Integer.toBinaryString(number) + "\n" + "Number in Octal: " + Integer.toOctalString(number) + "\n" + "Number in Hexadecimal: " + Integer.toHexString(number) + "\n";
        JOptionPane.showMessageDialog(null, message);
    }
}
