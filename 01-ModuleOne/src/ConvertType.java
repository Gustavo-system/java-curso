public class ConvertType {

    public static void main(String[] args) {
        String numberToInt = "50";
        int numberInt = Integer.parseInt(numberToInt);
        System.out.println("numberInt = " + numberInt);

        String numberToDouble = "1313.0e-3";
        double numberDouble = Double.parseDouble(numberToDouble);
        System.out.println("numberDouble = " + numberDouble);

        String textToBoolean = "false"; // Ignore case in this method -> String textToBoolean = "TruE"
        // This is not ok -> String textToBoolean = "1" or String textToBoolean = "yes"
        boolean anyBoolean = Boolean.parseBoolean(textToBoolean);
        System.out.println("anyBoolean = " + anyBoolean);

        // convert to String now
        int numberToString = 10;
        int numberToStringTwo = 100;
        String numberInStr = Integer.toString(numberToString);
        String anotherNumberInStr = String.valueOf(numberToStringTwo);

        System.out.printf("Number in string: " + numberInStr);
        System.out.printf("Number in string: " + anotherNumberInStr);
        
        // casting 
        int numberTwoInt = 120;
        short numberShort = (short) numberTwoInt; // -> casting 
        long numberLongTwo = numberTwoInt;

        System.out.println("numberLong = " + numberLongTwo);
        System.out.println("numberShort = " + numberShort);
        

    }

}
