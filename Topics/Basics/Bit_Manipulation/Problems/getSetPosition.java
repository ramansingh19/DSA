package Bit_Manipulation.Problems;

public class getSetPosition {

    public static int getSetPosition(int n){
        if (n ==0 || (n&(n-1)) !=0){
            return -1;
        }
        int pos = 1;
        while ((n&1) ==0){
            n>>=1;
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {

        System.out.println(getSetPosition(4));
    }
}
