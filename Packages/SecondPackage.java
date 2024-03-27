package com.example;

import com.example.math.Calculator; // Importing Calculator class from the com.example.math package

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Performing arithmetic operations
        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int product = calculator.multiply(10, 5);
        int quotient = calculator.divide(10, 5);

        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
