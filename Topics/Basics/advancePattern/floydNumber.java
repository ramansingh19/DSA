package advancePattern;

public class floydNumber {

    public static void FLOYD_Number(int n , int counter){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FLOYD_Number(5,1);
    }
}
