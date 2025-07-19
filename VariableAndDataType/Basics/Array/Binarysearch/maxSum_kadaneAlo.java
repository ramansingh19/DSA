package Array.Binarysearch;

import java.util.*;
public class maxSum_kadaneAlo {


    public static void maxSum_kadaneAlog(int arr[]){
            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;

            //index 0 to infinite using this loop.
            for (int i=0; i<arr.length; i++){
                currSum = arr[i];
                if (currSum < 0){
                    currSum = 0;
                }
                maxSum = Math.max(currSum , maxSum);
            }
        System.out.println("no of max value is :"+ maxSum);
    }


    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSum_kadaneAlog(arr);

    }
}
