public class Loops {
    public static void main(String[] args) {
        // FOR
        // si el bloque de codigo es una sola linea se puede usar sin las llaves
        // de lo contrario se deben usar las llaves
        for(int iterador = 0; iterador <= 10; iterador++){
            System.out.println("ronda 1: " + iterador);
        }

        System.out.println("\n");

        // for desestructurado
        int iteradorDos = 0;
        for(;;){
            if(iteradorDos > 5){
                break;
            }
            System.out.println("ronda 2: " + iteradorDos);
            iteradorDos++;
        }
    }
}
