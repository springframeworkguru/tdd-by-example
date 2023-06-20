import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class SortingTest {

    @Test
    // Test case to verify the functionality of the bubble sort algorithm
    public void testing() {
        // Create an instance of the Sort class
        Sort sort = new Sort();

        // Create an array of integers
        int[] arr = new int[]{1, 3, 2, 0};

        // Call the bubble method on the Sort instance to sort the array
        sort.bubble(arr);

        // Print the sorted array to the console
        System.out.println(Arrays.toString(arr));
    }
}
