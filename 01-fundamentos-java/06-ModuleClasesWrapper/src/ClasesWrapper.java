import java.lang.reflect.Method;

public class ClasesWrapper {

    /*
    Primitivo       Clase equivalente
    * byte      ->      Byte
    * short     ->      Short
    * int       ->      Integer
    * long      ->      Long
    * float     ->      Float
    * double    ->      Double
    * char      ->      Character
    * boolean   ->      Boolean

    * */

    public static void main(String[] args) {

        // wrapper integer
        Integer initObjet = Integer.valueOf(2168); //se instancia un valor integer
        // Integer initObjet = 123; // forma implicita -> autoboxing
        // int initPrimitivo = 123;

        // GETCLASS()
        String texto = "Hola mundo";

        //retorna una instancia de tipo Class
        Class classStr = texto.getClass();

        System.out.println("classStr.getName() = " + classStr.getName());
        System.out.println("classStr.getName() = " + classStr.getSimpleName());
        System.out.println("classStr.getName() = " + classStr.getPackage());

        for(Method metodo : classStr.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

    }
}
