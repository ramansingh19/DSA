package Bit_Manipulation.Problems;

public class Problem_06 {

    public static boolean powOfTwo(int n){
        if (n <= 0){
            return false;
        }
        return (n & (n-1))==0;
    }

    public static void main(String[] args) {

        System.out.println(powOfTwo(60));
    }
}
