package Bit_Manipulation.Problems;

public class Problem_03 {

        public static int addOne(int n){
            int mask = 1;
            while ((n & mask) !=0){
                //if current bit is 1 flip it to 0
                n = n ^ mask;
                mask<<=1; // move to the next bit
            }
            n = n^mask;

            return n;
        }

    public static void main(String[] args) {
        System.out.println(addOne(2));
    }
}
