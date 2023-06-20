import org.junit.Test;
import static org.junit.Assert.*;

public class MaxnumberTest {

    @Test
    // Test case to verify the functionality of max_num method
    public void textMax() {
        // Create an instance of the Max class
        Max max = new Max();

        // Create an array of integers
        int[] arr = new int[]{1, 2, 3, 4};

        // Call the max_num method on the Max instance
        // and store the result in the 'max_number' variable
        int max_number = max.max_num(arr);

        // Check if the result is equal to 4 using the assertEquals method
        assertEquals(4, max_number);
    }
}
