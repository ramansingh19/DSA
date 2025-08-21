package Array.LinearSearch;

public class largestNumber {

    public static int largestNumber(int arr[] ){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
            if (smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest number : "+ smallest);
        return  largest;
    }

    public static void main(String[] args) {
        int arr[] = {2,6,4,7,20,56,45,67};
        System.out.println("largest number in array list is : "+ largestNumber(arr));

    }
}
