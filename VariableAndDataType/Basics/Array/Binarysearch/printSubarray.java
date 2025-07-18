package Array.Binarysearch;
import java.util.*;

public class printSubarray {

    public static void subArray(int arr[]) {

        int tp = 0; // total subarrays
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;

                // Print current subarray and calculate its sum
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }

                System.out.print("=> Sum: " + sum);
                System.out.println();

                // Update min and max
                if (sum > maxSum) {
                    maxSum = sum;
                }

                if (sum < minSum) {
                    minSum = sum;
                }

                tp++;
            }

            System.out.println();
        }

        System.out.println("Total Subarrays: " + tp);
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Minimum Subarray Sum: " + minSum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        subArray(arr);
    }
}
