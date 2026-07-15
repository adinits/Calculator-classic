package com.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(4, calculator.subtract(7, 3));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        assertEquals(5.0, calculator.divide(10, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldRejectDivisionByZero() {
        calculator.divide(10, 0);
    }
}
