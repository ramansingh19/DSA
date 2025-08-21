package Array;

public class sortedArray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,9,};
        boolean isSorted = true;

        for (int i=0; i< arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("number is in sorted form");
        }else {
            System.out.println("number is not in a sorted form");
        }
    }
}
