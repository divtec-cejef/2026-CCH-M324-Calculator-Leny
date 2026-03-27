package ch.divtec;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTests {

    private final Calculator calculator = new Calculator();

    @Test
    public void add() {
        // Addition 0
        assertEquals(0, this.calculator.add(0,0));

        // Addition nombre positifs
        assertEquals(43, this.calculator.add(21, 22));

        // Addition nombre négatifs.
        assertEquals(-5, this.calculator.add(-2 ,-3));

        // Addition nombre négatifs et positifs
        assertEquals(6, this.calculator.add(-3, 9));
    }

    @Test
    void substract() {

    }

    @Test
    void multiply() {
        assertEquals(0, (int)calculator.multiply(0, -5649687));
        assertEquals(0, calculator.multiply(0, -5649687), 0.000000000000000000001);
    }

    @Test
    void divide() {

    }

    @Test
    void factorialOfZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void factorialDecimal() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(3.2);
        });

        String expectedMessage = "Number must be an integer";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void factorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           calculator.factorial(-5);
        });

        String expectedMessage = "Number must be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}