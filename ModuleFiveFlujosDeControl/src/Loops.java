public class Loops {
    public static void main(String[] args) {
        System.out.println("\nfor");
        // FOR
        // si el bloque de codigo es una sola linea se puede usar sin las llaves
        // de lo contrario se deben usar las llaves
        for(int iterador = 0; iterador <= 5; iterador++){
            System.out.println("ronda 1: " + iterador);
        }

        System.out.println("\nfor desestructurado");

        // for desestructurado
        int iteradorDos = 0;
        for(;;){
            if(iteradorDos > 5){
                break;
            }
            System.out.println("ronda 2: " + iteradorDos);
            iteradorDos++;
        }

        System.out.println("\nforeach");

        String[] namesPets = {"chanchito", "chanchito feliz", "borreguito"};
        for (String namePet: namesPets) {
            System.out.println("namePet = " + namePet);
        }

        System.out.println("\nwhile");

        // while
        int contador = 0;
        while(contador < 5){
            System.out.println("ronda 3: " + contador);
            contador++;
        }

        System.out.println("\ndo-while");

        // do-while
        int contadorNuevo = 0;
        do{
            System.out.println("se ejecuta al menos una vez");
        }while (contadorNuevo != 0);

    }
}
