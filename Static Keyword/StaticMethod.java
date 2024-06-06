class Utility {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = Utility.add(5, 3);
        System.out.println("Result: " + result);
    }
}
