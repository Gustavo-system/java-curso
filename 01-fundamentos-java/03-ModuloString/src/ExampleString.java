public class ExampleString {
    public static void main(String[] args) {

        String textOne = "My first string";
        String textTwo = new String("my first string");

        boolean isEquals = textOne == textTwo;
        int textCompare = textOne.compareTo(textTwo);
        System.out.println("isEquals textOne and textTow ? = " + isEquals); // -> return false
        System.out.println("textCompare = " + textCompare); // -> return 0 or 1 if str is equals

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
        System.out.println("hello.charAt(0) = " + hello.charAt(0)); // -> return the character in the index position = H
        System.out.println("hello.substring(1,4) = " + hello.substring(1,4)); // -> return = ell, because the final index not inclusive
        System.out.println("hello.indexOf('l') = " + hello.indexOf('o')); // return always the first position
        System.out.println("hello.lastIndexOf('o') = " + hello.lastIndexOf('o')); // return the last match // if not exist return -1 
        System.out.println("hello.contains(\"lo\") = " + hello.contains("lo")); // only accept a string, not chart -> return true o false
        System.out.println("hello.startsWith(\"lo\") = " + hello.startsWith("lo")); // only accept a string, not chart -> return true o false
        System.out.println("hello.endsWith(\"lo\") = " + hello.endsWith("lo")); // only accept a string, not chart -> return true o false
        System.out.println("  erasing spaces in the text  ".trim());
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

        /*
         * Validate string
         *
         * if variable is null generate a null-exception always
         * String variableNull = null;
         */

        int longText = hello.length();
        System.out.println("longText = " + longText);

        boolean isEmptyText = hello.isEmpty();
        System.out.println("isEmptyText = " + isEmptyText);
        /*
         * This method exist after jdk eleven
         *
         * boolean isBlankText = hello.isBlank();
         */



    }
}
