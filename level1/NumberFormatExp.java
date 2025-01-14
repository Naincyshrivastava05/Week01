public class NumberFormatExp {

    // Method to deliberately throw a NumberFormatException
    public static void thowNumberFormatExp() {
        // Defining a string that contains non-numeric characters
        String s = "123abc";
        System.out.println("Exception will occur now");
        
        // Attempting to convert the non-numeric string to an integer, which will throw NumberFormatException
        int num = Integer.parseInt(s);
        
        // This statement will not execute because the exception occurs in the previous line
        System.out.println("Converted Number: " + num);
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatExp() {
        // Defining a string that contains non-numeric characters
        String s = "123abc";
        System.out.println("Handling NumberFormatException");
        
        try {
            // Attempting to convert the non-numeric string to an integer
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            // Catching and handling the NumberFormatException
            System.out.println("Exception caught. Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            // Calling the method that deliberately throws NumberFormatException
            thowNumberFormatExp();
        } catch (NumberFormatException e) {
            // Catching the exception and calling the handler method
            System.out.println("Exception occurred in thowNumberFormatExp(). Calling handleNumberFormatExp() method.");
            handleNumberFormatExp();
        }
    }
}
