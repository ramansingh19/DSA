package Bit_Manipulation.Problems;

public class update {

    public static int getIthBit(int n , int i){
        int bitmask = 1<<i;
        if ((n & bitmask) ==0){
            return 0;
        }else {
            return 1;
        }
    }

    public static int setithBit(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearithBit(int n , int i){
        int bitmask = ~(1<<i);
        return  n & bitmask;
    }

    public static int update(int n , int i , int bit){
        if (bit == 0){
           return clearithBit(n,i);

        }else {
           return setithBit(n ,i);
        }
    }

    public static void main(String[] args) {
        System.out.println(update(20,1,2));

    }
}
