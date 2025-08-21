package Bit_Manipulation.Problems;

public class Even_Odd {

    public static void EvenOdd(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
            EvenOdd(3);
            EvenOdd(4);
            EvenOdd(9);
            EvenOdd(10);
    }
}
