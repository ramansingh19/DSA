package advancePattern;

public class zeroonrtriangle {

    public static void zero_Triangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println( );
        }
    }

    public static void main(String[] args) {
        zero_Triangle(5);
    }
}
