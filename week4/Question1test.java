package week4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question1test {
	Calculator calculator = new Calculator();

    @Test
    void testAddition() {

        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {

        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {

        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void testDivision() {

        assertEquals(5, calculator.divide(10, 2));
    }
}
