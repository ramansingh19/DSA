package Bit_Manipulation.Problems;

public class Problem_01 {

        public static double PowerSelf(double x){
            // special case: 0^0 is indeterminate, here we return 1 (common in programming)
                if (x == 0.0){
                    return 1.0;
                }
            // for positive x, use formula: x^x = e^(x * ln(x))
                if (x > 0){
                    return Math.exp(x * Math.log(x));
                }
            // for negative x: only works if x is an integer
            if (x % 1 ==0){
                return Math.pow(x , x );
            }
            throw new ArithmeticException("x^x not defined for negative non-integers in real numbers");
        }

    public static void main(String[] args) {

        System.out.println(PowerSelf(4));
        System.out.println(PowerSelf(3));
        System.out.println(PowerSelf(-2));
        System.out.println(PowerSelf(0.4));
//        System.out.println(PowerSelf(-0.34));-->not possible it is complex number
        System.out.println(PowerSelf(0));
    }
}
