package FunctionAndMethod;

public class binomialCoefficient {

    public static int factorial(int n) {
        int f = 1;
        for (int i=1; i<=n; i++){
            f *= i;
        }
        return f;

    }

    public static int binomial(int n , int r){
        int fact_r = factorial(r);
        int fact_n = factorial(n);
        int fact_nmr = factorial(n-r);

        int binomail = fact_n / (fact_r * fact_nmr);
        return binomail;

    }

    public static void main(String[] args) {
        System.out.println(binomial(5,2));
    }
}
