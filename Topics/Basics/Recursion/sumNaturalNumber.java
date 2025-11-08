package Recursion;

public class sumNaturalNumber {
    public static int  sum(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int sum = sum(n-1);
        int snm1 = n + sum(n-1);
        return snm1;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(0));
    }
}
