package Array.RevisionArray.Hard;

public class subArraySumK {
    public static int cntSubarrays(int[] arr, int k) {
        // code here
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];

                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        System.out.println(cntSubarrays(arr, 4));
    }
}
