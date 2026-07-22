package com.example.calculator;

/**
 * Core calculator business logic.
 * This class intentionally uses Java 8-compatible syntax.
 */
public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (double) firstNumber / secondNumber;
    }
}
