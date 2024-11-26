import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(5, 4), "5 - 4 should equal 1");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, Calculator.divide(5, 2), "5 / 2 should equal 2.5");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0));
    }

    @Test
    public void testPower() {
        assertEquals(8, Calculator.power(2, 3), "2 ^ 3 should equal 8");
    }
}
