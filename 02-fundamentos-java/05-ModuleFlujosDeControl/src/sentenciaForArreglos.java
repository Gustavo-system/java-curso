import javax.swing.*;

public class sentenciaForArreglos {
    public static void main(String[] args) {
        // definicion de arreglos
        //String[] names = new String[6]; // se define la longitud que tendra el arreglo
        String[] pets = {"cat", "dog", "mouse"}; // se definen los valores que tendra el array, como buena practica ponerlo en el tipo
        //String foods[] = {"tacos", "cemitas", "pizza"}; // se puede definir como arreglo en el nombre

        int count = pets.length; // por buenas practicas se podria declarar el contador fuera del for para solo inicializarlo una vez
        for (int i = 0; i < count; i++) {
            System.out.println("pets number: " + i + " type: " + pets[i]);
        }

        String pet = JOptionPane.showInputDialog("Enter a pet type");
        System.out.println("type pet to search = " + pet);

        boolean encontrado = false;

        for (String item : pets) {
            if (item.equalsIgnoreCase(pet)) {
                encontrado = true;
                System.out.println("si se encontro el tipo de mascota");
                break;
            }
        }

        if(encontrado) {
            JOptionPane.showMessageDialog(null, String.format("Mascota %s encontrada", pet));
        } else {
            JOptionPane.showMessageDialog(null, "Mascota no encontrada");
        }
    }
}
