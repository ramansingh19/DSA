package Array.RevisionArray;

public class largestNumber {

    public static void main(String[] args) {
        int[] arr = {3,33,2,43,23,34,23,};
        int max = arr[0];
        //for(int num : arr) also use able
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }


}
