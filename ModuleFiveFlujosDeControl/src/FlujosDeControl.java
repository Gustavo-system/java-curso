public class FlujosDeControl {

    public static void main(String[] args) {
        /*
         *
         * floor if else
         *
         * sintaxis:
            if(condicion){
                bloque de codigo;
            }
            else{
                bloque de codigo
            }
         */

        float promedio = 7.9f; // es una variable con un scope global

        // si el if o el else tiene una sola linea de codigo se puede poner sin las llaves,
        // si tiene mas de una es necesario pner las llaves
        if(promedio >= 9.0 && promedio == 10.0){
            String variableLocal= "variable dentro del scope del if";
            System.out.println("Si pasaste la materia, exelente");
        }else if(promedio >= 7.5 && promedio <= 8.9 ){ // se puede agragar el else if()
            System.out.println("Aprobado con promedio mejorable!");
        }else{
            System.out.println("No pasaste la materia");
        }

        // flujo de control switch
    }
}
