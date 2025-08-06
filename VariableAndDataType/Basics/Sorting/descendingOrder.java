package Sorting;

public class descendingOrder {

    //Using bubble sort algo
//    public static void descendingOrder(int arr[]){
//        for (int i=0; i<arr.length-1; i++){
//            int swaps = 0;
//            for (int j=0; j<arr.length-1-i; j++){
//                if (arr[j] < arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swaps++;
//                }
//            }
//            if (swaps==0){
//                break;
//            }
//        }
//    }

//    //Using insertion sort algo
//    public static void insertionDes(int arr[]){
//        for (int i=1; i< arr.length; i++){
//            int curr = arr[i];
//            int prev = i-1;
//            while (prev >= 0 && arr[prev] < curr){
//                arr[prev+1] = arr[prev];
//                prev--;
//            }
//            arr[prev+1] = curr;
//        }
//    }

//    //using Selection sort
//    public static void slectionSort(int arr[]){
//        for (int i=0; i<arr.length-1; i++){
//            int max = i;
//            for (int j = i+1; j<arr.length; j++){
//                if (arr[max] < arr[j]){
//                    max = j;
//                }
//            }
//            int temp = arr[max];
//            arr[max] = arr[i];
//            arr[i] = temp;
//        }
//    }

    //using counting Sort



    public static void Printarr(int arr[]){


        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
//        descendingOrder(arr);
//        insertionDes(arr);
//        slectionSort(arr);
        Printarr(arr);
    }
}
