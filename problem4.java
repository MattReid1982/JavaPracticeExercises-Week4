public class problem4 {
    
    // Find the largest element and its location (index) in an integer array.
    // Param arr (the input integer array) and return a string containing the largest element and its index.
    public static String findLargestElementAndIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "Array is null or empty";
        }

        // Initialize max value with the first element and max index with 0
        int maxValue = arr[0];
        int maxIndex = 0;

        // Initialize through the array starting from the second element (index 1)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                // Update max value and max index if a larger element is found
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        return "Larges element: " + maxValue + ", Location (Index): " + maxIndex;
    }

    public static void main(String[] args) {
        int[] array1 = {10, 20, 5, 8, 30};
        System.out.println(findLargestElementAndIndex(array1)); // Output: Largest element is 30 and the location index is 4

        int[] array2 = {-5, -1, -10, -20};
        System.out.println(findLargestElementAndIndex(array2)); // Output: Largest element is -1 and the location index is 1

        int[] array3 = {7, 3, 7, 1, 7};
        System.out.println(findLargestElementAndIndex(array3)); // Output: Largest element is 7 and the location index is 0

        // With duplicate maximums, this method returns the index of the first occurrence.
    }
}
