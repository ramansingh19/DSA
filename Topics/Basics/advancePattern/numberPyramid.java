package advancePattern;

public class numberPyramid {

    public static void number_Pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_Pyramid(5);
    }
}
