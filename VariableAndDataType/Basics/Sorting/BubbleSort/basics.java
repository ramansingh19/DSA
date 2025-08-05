package Sorting.BubbleSort;

public class basics {

    public static void bubbleSort(int arr[]){
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

    public static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {8,70,6,90,4,4,3,};
        bubbleSort(arr);
        printArr(arr);

    }
}
