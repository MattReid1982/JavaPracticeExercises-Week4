

public class problem6 {
    
    // Counts and prints the number of odd and even elements in an integer array.
    // Param numbers (the integer array to process).
    public static void countOddEven(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        // go through the array using a for-each loop
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the results
        System.out.println("Number of even elements in the array: " + evenCount);
        System.out.println("Number of odd elements in the array: " + oddCount);
    }

    // The Array
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Processing array: " + java.util.Arrays.toString(Array));

        // Call method to count and print
        countOddEven(Array);
    }
}
