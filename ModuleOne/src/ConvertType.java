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
    }

}
