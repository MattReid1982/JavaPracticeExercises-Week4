import java.util.Arrays;
import java.util.Collections;

public class problem7Part2 {
    public static void main(String[] args) {
        // Use Integer[] (wrapper class) instead of int[] (primitive)
        Integer[] arr = {5, 2, 8, 1, 9};

        // Sort the array in descending order using Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Array in Descending Order: " + Arrays.toString(arr));
        // Output: Array in Descending Order: [9, 8, 5, 2, 1]
    }
}
