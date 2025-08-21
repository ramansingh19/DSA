package Array.Binarysearch;
import java.util.*;
public class maxsubarraySum {

    //0(nsqrof2)

    public static void maxSubrraysum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];

        //use this formula to find the max sum
        prefix[0] = arr[0];
        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //loop to read the values
        for (int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i; j<arr.length; j++){
                int end = j;
                //tofind the
                int sum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
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
