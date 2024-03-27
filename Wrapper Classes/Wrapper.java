public class WrapperExample {
    public static void main(String[] args) {
        // Example with Integer wrapper class
        Integer number = new Integer(10); // Boxing - converting int to Integer object
        int value = number.intValue(); // Unboxing - converting Integer object to int
        System.out.println("Value: " + value);

        // Example with Double wrapper class
        Double d = 10.5; // Auto-boxing - converting double to Double object
        double result = d + 5.5; // Auto-unboxing - converting Double object to double
        System.out.println("Result: " + result);
    }
}