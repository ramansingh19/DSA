package FunctionAndMethod;


public class averageNumber {
    public static int AverageNum (int a , int b) {
        int avg = (a+b)/2;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println( AverageNum(50,100));
    }
}

//2nd solution
//import java.util.Scanner;
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        double x = sc.nextDouble();
//        System.out.print("Input the second number: ");
//        double y = sc.nextDouble();
//        System.out.print("Input the third number: ");
//        double z = sc.nextDouble();
//        System.out.print("The average value is " + average(x, y, z)+"\n" );
//    }
//    public static double average(double x, double y, double z) {
//        return (x + y + z) / 3;
//    }
//}
