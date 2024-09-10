public class EtiquetasLoos {

    public static void main(String[] args) {

        System.out.println("----------------- Etiqueta con continue en for ------------------");

        /*
         * Se brinca la iteracion con el continue
         */
        continueBlock:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue continueBlock;
                }

                System.out.println("[i = " + i + ", j = " + j + "]");
            }

        }

        System.out.println("----------------- Etiqueta con break en for ------------------");

        /*
         * Se termina la iteracion del bucle con la etiqueta indicada
         */
        romperIteracion:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break romperIteracion;
                }

                System.out.println("[i = " + i + ", j = " + j + "]");
            }
        }

        System.out.println("----------------- Etiqueta con break en while ------------------");

        romperWhile:
        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j < 5) {
                if (i == 2) {
                    break romperWhile;
                }
                j++;

                System.out.println("[i = " + i + ", j = " + j + "]");
            }
        }


    }

}
