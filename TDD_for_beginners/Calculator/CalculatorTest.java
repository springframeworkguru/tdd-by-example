import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testProduct() {
        // Create an instance of the Calculator class
        Calculator product = new Calculator();

        // Call the multiply method on the Calculator instance
        // and store the result in the 'prod' variable
        int prod = product.multiply(2,4);

        // Check if the result is equal to 8 using the assertEquals method
        assertEquals(8,prod);
    }

    @Test
    public void testAdd() {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Call the add method on the Calculator instance
        // and store the result in the 'result' variable
        int result = calculator.add(2, 3);

        // Check if the result is equal to 5 using the assertEquals method
        assertEquals(5, result);
    }
}
