package Bit_Manipulation.Problems;

import java.util.Arrays;

public class Problem_07 {

    public static int[] duplicate(int[] arr){
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor ^= arr[i];
        }
        int setBit = xor & -xor;
        int num1 = 0;
        int num2 = 0;

        for (int i=0; i< arr.length; i++){
            if ((arr[i] & setBit) != 0){
                num1 ^= arr[i];
            }else{
                num2 ^= arr[i];
            }
        }
        int[] ans = new int[2];
        ans[0] = Math.min(num1 , num2);
        ans[1] = Math.max(num1 , num2);
        return  ans;
    }

    public static void main(String[] args) {
            int arr[] = {1,2,3,2,1,4,9,7,6,6,5,7};
        int[] result = duplicate(arr);
        System.out.println(Arrays.toString(result));
    }
}
