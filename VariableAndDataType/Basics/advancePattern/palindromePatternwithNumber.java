package advancePattern;

public class palindromePatternwithNumber {

    public static void palinwithNumber(int n){
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //increasing
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            //decreasing
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palinwithNumber(3);
    }
}
