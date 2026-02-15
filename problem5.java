public class problem5 {
    // Method to search for an integer element in an array
    // It searches the array arr for the integer target.
    // If the target is found, the method returns its index.
    // If the target is not in the array, the method returns -1.
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) { // Read each element using a loop
            if (arr[i] == target) { // Compare the current element with the target
                return i; // Return the index if a match is found
            }
        }
        return -1; // Return -1 if the element is not found after checking all elements
    }

    public static void main(String[] args) {
        int[] myArray = {10, 2, 8, 4, 6}; // Example unsorted array
        int searchValue = 8;

        int resultIndex = linearSearch(myArray, searchValue);

        if (resultIndex != -1) {
            System.out.println("Element " + searchValue + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + searchValue + " not found in the array.");
        }
    }
}
