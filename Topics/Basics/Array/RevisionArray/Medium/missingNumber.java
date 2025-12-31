package Array.RevisionArray.Medium;

public class missingNumber {
    public static int missingNumber(int arr[] , int num){
        int expectedSum = num * (num + 1) / 2;
        int actualSum = 0;

        for (int i=0; i<arr.length; i++){
            actualSum += arr[i];

        }
        int missingNum = expectedSum - actualSum;

        return  missingNum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int num = 5;

        System.out.println(missingNumber(arr , num));
    }
}
