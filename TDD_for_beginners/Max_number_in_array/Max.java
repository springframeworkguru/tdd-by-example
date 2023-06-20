import java.util.Arrays;

public class Max {

    // Array of integers
    int[] arr = new int[]{1, 2, 3, 4};

    // Method to find the maximum number in an array
    public int max_num(int[] arr) {
        int max = 0;

        // Iterate through the array
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }
}
