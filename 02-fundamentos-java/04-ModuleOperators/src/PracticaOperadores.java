import javax.swing.*;

public class PracticaOperadores {

    public static void main(String[] args) {

        boolean esAutenticado = false;

        String[] usernames = new String[2];
        String[] passswords = new String[2];
        usernames[0] = "admin";
        passswords[0] = "12345";
        usernames[1] = "gus";
        passswords[1] = "12345";

        /*
         * Otra forma de inicializar los arreglos
         * String[] usernames = { "valor1", "valor2", "valor3"}
         */

        String usuario = JOptionPane.showInputDialog("Ingrese usuario");
        String password = JOptionPane.showInputDialog("Ingrese contraseña");

        for (int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(usuario) && passswords[i].equals(password)) {
                esAutenticado = true;
                break;
            }
            else{
                System.out.println("Usuario o contraseña incorrectos");
            }
        }

        if(esAutenticado) {
            JOptionPane.showMessageDialog(null, "Autenticacion exitosa, Welcomen user ".concat(usuario));
        }else{
            JOptionPane.showMessageDialog(null, "Usuario y password incorrecto");
        }
    }

}
