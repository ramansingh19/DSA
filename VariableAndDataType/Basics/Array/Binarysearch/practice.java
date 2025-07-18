package Array.Binarysearch;
import java.util.*;

public class practice {

    public static void subArray(int arr[]){
        int tp = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i; j<arr.length; j++){
                int end = j;
                int sum = 0;
                for (int k=start; k<=end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum+arr[k];
                }
                System.out.println("=> Sum : "+ sum);
                System.out.println();
                if (sum > maxSum){
                    maxSum = sum;
                }
                if (sum < minSum){
                    minSum = sum;
                }
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair is :"+ tp);
        System.out.println("max no of subarray : "+ maxSum);
        System.out.println("min no of subarray : "+ minSum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArray(arr);
    }
}
