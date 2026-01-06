package Array.RevisionArray.Hard;

public class maxSubArraySum {
    public static void maxubArrSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

       for (int i=0; i< arr.length; i++){
           int currSum = 0;
           for (int j=i; j<arr.length; j++){
               currSum += arr[j];
               maxSum = Integer.max(currSum , maxSum);

           }
       }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {3,-4,5,4,-1,7,-8};
            maxubArrSum(arr);
    }
}
