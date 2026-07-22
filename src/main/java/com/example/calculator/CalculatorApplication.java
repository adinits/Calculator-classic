package com.example.calculator;

import java.util.Scanner;

/**
 * Legacy console entry point.
 */
public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Legacy Calculator Java 8");
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("Addition: " + calculator.add(first, second));
        System.out.println("Subtraction: " + calculator.subtract(first, second));
        System.out.println("Multiplication: " + calculator.multiply(first, second));

        if (second != 0) {
            System.out.println("Division: " + calculator.divide(first, second));
        } else {
            System.out.println("Division skipped because the second number is zero.");
        }

        scanner.close();
    }
}
