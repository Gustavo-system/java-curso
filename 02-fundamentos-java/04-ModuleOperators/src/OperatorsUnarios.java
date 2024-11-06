public class OperatorsUnarios {
    public static void main(String[] args) {

        // se utilizan para invertir los valores

        int numero = -5;
        int numeroNegativo = +numero;
        System.out.println("numeroNegativo = " + numeroNegativo);

        int numeroPositivo = -numeroNegativo;
        System.out.println("numeroPositivo = " + numeroPositivo);


        // post incremento y decremento
        int numeroUno = 5;
        int postIncremento = numeroUno++;
        System.out.println("postIncremento = " + postIncremento);

        int postDecremento = numeroUno--;
        System.out.println("postDecremento = " + postDecremento);


        // pre incremento y decremento
        int numeroDos = 5;
        int preIncremento = ++numeroDos;
        System.out.println("preIncremento = " + preIncremento);

        int preDecremento = --numeroDos;
        System.out.println("preDecremento = " + preDecremento);

    }
}
