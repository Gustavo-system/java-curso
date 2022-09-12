import javax.swing.*;

public class BuscarElementos {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int numeroBuscar = -1;
        boolean encotrado = false;

        //Buscar un elemento en un array de enteros
        try{
            numeroBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que desea buscar"));
            System.out.println("numero a buscar -> " + numeroBuscar);
        }catch (Exception e){
            System.out.println("ingrese un valor numerico"+ e.getMessage());
            main(args);
            System.exit(0);
        }

        for (int numero : numeros){
            if(numero == numeroBuscar){
                encotrado = true;
                break;
            }
        }

        if(encotrado){
            JOptionPane.showMessageDialog(null, "Numero encontrado");
        }else{
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
        }

    }
}
