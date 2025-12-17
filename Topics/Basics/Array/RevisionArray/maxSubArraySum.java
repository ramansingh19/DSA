package Array.RevisionArray;

public class maxSubArraySum {
    public static void maxubArrSum(int arr[]) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i; j<arr.length; j++){
                int end = j;
                currsum = 0;
                for (int k=start ; k<=end; k++){
                    currsum += arr[k];
                }
                System.out.print(currsum);
                if (max < currsum){
                    max = currsum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maxsum"+ max);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
            maxubArrSum(arr);
    }
}
