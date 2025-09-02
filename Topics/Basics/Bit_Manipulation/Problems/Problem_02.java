package Bit_Manipulation.Problems;

public class Problem_02 {

    public static void SwapNumber(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 17;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        SwapNumber(a, b);
    }
}
