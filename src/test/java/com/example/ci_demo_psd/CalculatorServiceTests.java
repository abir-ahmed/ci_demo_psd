package com.example.ci_demo_psd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorServiceTests {
    @Autowired
    private CalculatorService calculatorService;

    @Test
    public void testAdd() {
        int result = calculatorService.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    public void testSubtract() {
        int result = calculatorService.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    public void testMultiply() {
        int result = calculatorService.multiply(5, 3);
        assertEquals(15, result, "5 * 3 should equal 15");
    }

    @Test
    public void testDivide() {
        double result = calculatorService.divide(6, 3);
        assertEquals(2.0, result, "6 / 3 should equal 2.0");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(6, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
