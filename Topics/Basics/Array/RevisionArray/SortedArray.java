package Array.RevisionArray;

public class SortedArray {
    public static void SortedArray(int arr[]) {
        boolean isSorted = false;

       for (int i=0; i<arr.length-1; i++){
           if (arr[i] >  arr[i+1]){
                isSorted = false;
                break;
           }
       }
        if (isSorted){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("not sorted array");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,10};
        SortedArray(arr);
    }
}
