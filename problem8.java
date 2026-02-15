public class problem8 {
    
    public static void findSecondSmallestLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            // Find the largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // Find smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Second Smallest element: " + (secondSmallest == Integer.MAX_VALUE ? "N/A" : secondSmallest));
        System.out.println("Second Largest element: " + (secondLargest == Integer.MIN_VALUE ? "N/A" : secondLargest));

    }

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 7, 7, 5};
        findSecondSmallestLargest(data);
    }
}

