package Array.RevisionArray.Medium;

import java.util.Arrays;

public class rearrangeNumber {
    public static void rearrangeNum(int arr[]){
        int positiveArray[] = new int[arr.length];
        int negativeArray[] = new int[arr.length];

        int positive = 0;
        int negative = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] >= 0){
                positiveArray[positive] = arr[i];
                positive++;
            }else {
                negativeArray[negative] = arr[i];
                negative++;
            }
        }
        System.out.println("positive" + Arrays.toString(Arrays.copyOf(positiveArray , positive)));
        System.out.print("negative" + Arrays.toString(Arrays.copyOf(negativeArray , negative)));

        int result[] = new int[arr.length];
        int i=0;
        int j=0;
        int sorted = 0;

        while (i < positive && j < negative){
            result[sorted++] = positiveArray[i++];
            result[sorted++] = negativeArray[j++];

        }
        while (i < positive){
            result[sorted++] = positiveArray[i++];
        }
        while (j < negative){
            result[sorted++] = negativeArray[j++];
        }
        System.out.println("result " + Arrays.toString(result));
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,4,-1,9,7};
        rearrangeNum(arr);
    }
}
