package Bit_Manipulation.Problems;

public class Bitwise_Operators {


    //get ithBit
//    public static int getIthbit(int n, int i){
//
//
//        int bitmask = 1<<i;
//        if ((n & bitmask) == 0){
//            return 0;
//        }else {
//            return 1;
//        }
//
//    }

    //set ith Bit
    public static int setithBit(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    //clear ith bit
    public static int clearithBit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
        
    }

    //update ith bit
    public static int updateithBit(int n, int i, int bit){
        if (bit == 0){
            return clearithBit(n,i);
        }else {
            return setithBit(n,i);
        }
    }

    //clear last ith 1111 with i=2 = 1100
    public static int clearlastith(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    //clear range of bits
    public static int rangeofBits(int n, int i, int j){
        int a = ((~0)<< (j+1));
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }

    //finding if the number is power of 2 or not

    public static boolean powerof2ornot(int n){
        return (n&(n-1)) == 0;
    }

    //count set bit in number
    public static int countSet(int n){
        int count = 0;
        while(n>0){
            if ((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    //fast expotentiation
    public static int fasexponentiation(int n, int a){
        int ans = 1;
        while (n > 0){
            if ((n & 1) != 0 ){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {

//        System.out.println(getIthbit(20,2 ));
//        System.out.println(setithBit(10 , 2));
//        System.out.println(clearithBit(10,1));
//        System.out.println(updateithBit(10,2,1));
////        System.out.println(clearlastith(15 , 2));
//        System.out.println(rangeofBits(10,2,4));
//        System.out.println(powerof2ornot(540));
//        System.out.println(countSet(19));
        System.out.println(fasexponentiation(5,3));


    }
}
