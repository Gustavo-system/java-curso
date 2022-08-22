public class EjemploString {
    public static void main(String[] args) {

        String textOne = "My first string";
        String textTwo = new String("my first string");

        boolean isEquals = textOne == textTwo;
        System.out.println("isEquals textOne and textTow ? = " + isEquals); // -> return false

        boolean isEqualsText = textOne.equals(textTwo);
        boolean isEqualsTextIgnoreCase = textOne.equalsIgnoreCase(textTwo);
        System.out.println("use equals for text when compare info: " + isEqualsText); // -> return false for not upper case M
        System.out.println("use equals for text with ignore case: " + isEqualsTextIgnoreCase); // -> return true for ignore case M

        // concatenate, string is immutable
        String hello = "Hello";
        String world = "world";

        System.out.println(hello + " " + world); // -> Hello world
        String textNew = hello.concat(world); // -> return Hello world in new String
        String textNewTwo = hello.concat(" ".concat(world)); // -> return Hello world in new String
        String textNewThree = hello.concat(" ").concat(world); // -> return Hello world in new String
        /*
         * This method only exist after jdk Twelve
         *
         * String textNewFor = hello.transform(h -> {
         *    return h + " " + world;
         * });
         */


        // another methods for String
        hello.replace("H", "h");


        // performance of string
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 500; i++){
            // hello += " " + world + "\n";
            // hello.concat(world).concat("\n");
            sb.append(hello).append(world);
        }

        long finalTime = System.currentTimeMillis();

        System.out.println("performance is: " + (startTime - finalTime));


    }
}
