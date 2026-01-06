package Array.RevisionArray.Hard;

public class subarrayTargetSum {
    public static void targetSum (int[] arr, int target){

        boolean found = false;
        for (int i=0; i<arr.length; i++){
            int currSum = 0;
            for (int j=i; j<arr.length; j++){
                currSum += arr[j];
                if (currSum == target){
                    System.out.print("target is found between these index " + i + " " + j );
                    found = true;
                    return;
                }
            }
        }
        if(!found){
            System.out.println("not found ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int target;

        targetSum(arr , 12);
//        int[] result = targetSum(arr , target);
//
//        if (result[0] != -1){
//            System.out.println("Target sum found from index "
//                    + result[0] + " to " + result[1]);
//        }else {
//            System.out.println("No subarray found");
//        }
    }
}
