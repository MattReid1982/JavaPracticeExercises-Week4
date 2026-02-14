public class problem1 {
    public class ArrayCalculator {
        public static void calculateSumAndAverage(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty or null.");
                return;
            }

            int sum = 0;
            for (int value : arr) {
                sum += value;
            }
            // Calculate the average, and cast the sum to a double to ensure floating-point division
            double average = (double) sum / arr.length;
            
            // Print results
            System.out.println("The sum of the elements is: " + sum);
            System.out.println("The average of the elements is: " + average);
        }

        public static void main(String[] args) {
            int[] numbers = {8, 92, 29, 11, 62, 25, 41, 39, 88, 7}; // I just used the jersey numbers of my favourite players

            calculateSumAndAverage(numbers);
        }
    }
}

