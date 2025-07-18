package Array.Binarysearch;
import java.util.*;
public class maxsubarraySum {

    public static void maxSubrraysum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i; j<arr.length; j++){
                int end = j;
                int sum = 0;
                for (int k =start ; k<=end ; k++){
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.print("sum :" + sum);
                System.out.println();
                if (sum > maxSum){
                    maxSum = sum;
                }
                if (sum < minSum){
                    minSum = sum;
                }

            }
            System.out.println();
        }
        System.out.println("maxsum "+ maxSum);
        System.out.println("minsum"+ minSum);

    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubrraysum(arr);

    }
}
