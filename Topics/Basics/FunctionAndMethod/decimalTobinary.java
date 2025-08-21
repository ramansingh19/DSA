package FunctionAndMethod;

public class decimalTobinary {

    public static void decimalToBinary (int n ){
        int mynum = n;
        int pow = 0;
        int bin = 0;
        while (n > 0){
            int rem = n%2;//this is use for remanider
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;

            n = n/2;//this is use for coesicient
        }
        System.out.println("binary of "+ mynum + " = "+ bin );
    }

    public static void main(String[] args) {
        decimalToBinary(8);
    }

}
