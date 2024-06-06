class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Calling the add method with two integers
        int sum1 = mathOps.add(5, 3);
        System.out.println("Sum of 5 and 3: " + sum1);

        // Calling the overloaded add method with three integers
        int sum2 = mathOps.add(1, 2, 3);
        System.out.println("Sum of 1, 2, and 3: " + sum2);

        // Calling the overloaded add method with two doubles
        double sum3 = mathOps.add(2.5, 3.5);
        System.out.println("Sum of 2.5 and 3.5: " + sum3);
    }
}
