package Sorting;

import java.util.Arrays;

public class sortanArray {

    public static void main(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int target = 0;
            for (int j=0; j<arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    target++;

                }
            }
            if (target==0){
                break;
            }
        }
    }
    public static void PrintArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {5,4,3,6,2,1};
        Arrays.sort(arr);
        PrintArr(arr);
    }
}
