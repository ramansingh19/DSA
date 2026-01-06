package Array.RevisionArray.Hard;

public class maxSubarraykedran {
    public static int maxsubarray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxSum = Integer.max(currSum , maxSum);

            if (currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-10,5,9,7,3};
        System.out.println(maxsubarray(arr));
    }
}
