package Pattern;

public class invertedStarpattern {
    public static void main(String[] args) {
        for (int i=1; i<=7; i++){
            //for(int j=1; j<=4-i+1; j++ we can also use this
            for (int j=7; j>=i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
