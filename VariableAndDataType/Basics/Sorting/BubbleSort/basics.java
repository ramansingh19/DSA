package Sorting.BubbleSort;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class basics {

    public static void bubbleSort(Integer arr[]){
        for (int turn=0; turn< arr.length-1; turn++){
            int swaps = 0;
            for (int j=0; j< arr.length-1-turn; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;

                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }

    public static void printArr(Integer arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = {5,4,3,2,6,7,9};
//        bubbleSort(arr);
        Arrays.sort(arr, 0,6,Collections.reverseOrder());
        printArr(arr);

    }
}
