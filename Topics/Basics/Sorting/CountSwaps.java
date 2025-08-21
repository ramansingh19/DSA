package Sorting;

import java.util.Arrays;

public class CountSwaps {

    public static void main(int arr[]){
        int count = 0;
        for (int i=0; i< arr.length-1; i++){
            for (int j=0; j< arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Total Swaps" + count);
        PrintArr(arr);
    }

    public static void PrintArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {3,2,1};
        Arrays.sort(arr);

    }
}
