import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, Converter.fahrenheitToCelsius(32), "32F should equal 0C");
        assertEquals(100, Converter.fahrenheitToCelsius(212), "212F should equal 100C");
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, Converter.celsiusToFahrenheit(0), "0C should equal 32F");
        assertEquals(212, Converter.celsiusToFahrenheit(100), "100C should equal 212F");
    }

    @Test
    public void testPoundsToKilograms() {
        assertEquals(45.3592, Converter.poundsToKilograms(100), 0.0001, "100 pounds should equal 45.3592 kg");
    }

    @Test
    public void testKilogramsToPounds() {
        assertEquals(220.462, Converter.kilogramsToPounds(100), 0.0001, "100 kg should equal 220.462 pounds");
    }
}
