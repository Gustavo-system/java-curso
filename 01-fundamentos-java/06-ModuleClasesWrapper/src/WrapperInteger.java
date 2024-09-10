public class WrapperInteger {

    public static void main(String[] args) {

        // esta forma esta obsoleta de crear asi variables de tipo integer
        Integer intIntegerDeprecate = new Integer(12345);
        System.out.println("initIntegerDeprecate " + intIntegerDeprecate);

        // forma explicita de crear una variable con la clase wrapper
        Integer intIntegerExplicito = Integer.valueOf(1220); // unboxing
        System.out.println("initIntegerExplicito unboxing " + intIntegerExplicito);

        // forma implicita de crear una variable con la clase wrapper
        Integer intIntegerImplicito = 1220; // autoboxing
        System.out.println("initIntegerImplicito autoboxing " + intIntegerImplicito);


        /*
         * Convertir primitivos a clases wrappers
         */
        int intPrimivito = 12;
        Integer intWrapperClassValue = Integer.valueOf(intPrimivito); // Explicito
        System.out.println("Convertir primitivo a clase wrapper de forma explicita " + intWrapperClassValue);
        Integer intWrapperClassValue2 = intPrimivito; // Implicito
        System.out.println("Convertir primitivo a clase wrapper de forma implicita " + intWrapperClassValue2);

        /*
         * Convertir wrapper a primitivo
         * Se convierte con solo asignalo al tipo primitivo
         */
        int intPrimitivoAutoCast = intWrapperClassValue;
        System.out.println("Convertir wrapper Integer a primitivo int de forma automatica " + intPrimitivoAutoCast);

        int intPrimitivoAutoCast2 = intWrapperClassValue2.intValue();
        System.out.println("Convertir wrapper Integer a primitivo int de forma explcita '.intValue()' " + intPrimitivoAutoCast2);


    }
}
