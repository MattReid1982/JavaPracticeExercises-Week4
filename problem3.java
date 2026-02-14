import java.util.Scanner;


public class problem3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = getInputArray(scanner);

        // Calculate the squares and cubes
        int[] squaresArray = calculateSquares(originalArray);
        int[] cubesArray = calculateCubes(originalArray);

        // Print results
        printArrays(originalArray, squaresArray, cubesArray);

        scanner.close();
    }
    

    // Method to get an array of integers from user input.
    // Param scanner (the scanner object for input) and return the array populated with the users input.
    public static int[] getInputArray(Scanner scanner) {
        System.out.println("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    // Method to calculate the squares of array elements and store them in a new array.
    // Param original (the original array) and return a new array containing the squares.
    public static int[] calculateSquares(int[] original) {
        int[] squares = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            squares[i] = original[i] * original[i];
        }
        return squares;
    }

    // Method to calculate the cubes of array elements and store them in a new array.
    // Param original (the original array) and return a new array containing the cubes.
    public static int[] calculateCubes(int[] original) {
        int[] cubes = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            cubes[i] = original[i] * original[i] * original[i];
        }
        return cubes;
    }

    // Method to print the original, squares, and cubes arrays in a formatted way.
    // Param original, squares, and cubes arrays.
    public static void printArrays(int[] original, int[] squares, int[] cubes) {
        System.out.println("\n--- Results ---");
        System.out.printf("%-10s%-10s%-10s%n", "Number", "Squared", "Cubed");
        for (int i = 0; i < original.length; i++) {
            System.out.printf("%-10d%-10d%-10d%n", original[i], squares[i], cubes[i]);
        }
    }
}

