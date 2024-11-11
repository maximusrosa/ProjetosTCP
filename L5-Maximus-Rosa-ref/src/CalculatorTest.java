import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("Simple addition test")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }
    
    @Test
    @DisplayName("Simple subtraction test")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
    }
    
    @Test
    @DisplayName("Simple multiplication test")
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5), "3 * 5 should equal 15");
    }
    
    @Test
    @DisplayName("Simple division test")
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2.0");
    }
    
    @Test
    @DisplayName("Division by zero")
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
    
    @Nested
    @DisplayName("Advanced Calculator Tests")
    class AdvancedCalculatorTest {
        @Test
        @DisplayName("Test multiplication with zero")
        void testMultiplyWithZero() {
            assertEquals(0, calculator.multiply(5, 0), "5 * 0 should equal 0");
            assertEquals(0, calculator.multiply(0, 5), "0 * 5 should equal 0");
        }
        
        @Test
        @DisplayName("Test addition with negative numbers")
        void testAddNegativeNumbers() {
            assertEquals(-5, calculator.add(-2, -3), "-2 + -3 should equal -5");
        }
    }
}