import java.util.Arrays; //Imports the arrays

public class problem2 {
    public class ArrayIncrementer {
        
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Original array: " + Arrays.toString(numbers));

            incrementAndPrintArray(numbers);
        }

        public static void incrementAndPrintArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + 1;
            }

            System.out.println("Incremented array: " + Arrays.toString(arr));
        }

    }
}