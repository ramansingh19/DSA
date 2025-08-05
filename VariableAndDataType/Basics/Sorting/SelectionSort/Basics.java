package Sorting.SelectionSort;

public class Basics {

    public static void selectionSort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int max = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[max] > arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] ={8,4,6,9,28,78,9};
        selectionSort(arr);
        printArr(arr);

    }
}
