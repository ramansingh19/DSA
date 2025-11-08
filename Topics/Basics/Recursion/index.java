package Recursion;

public class index {

    public static void printDec(int n) {
        //Base case
        if (n == 1){
            System.out.print(n);
            return;
        }
        //follow call stack
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}


//Recursion is method of solving computational problem where the solution depends upon
// the smaller instance of the same problem

//Steps to solve recursion problem
// 1 --> base case
//2 --> kaam
//3 --> f(n-1) (inner call )
