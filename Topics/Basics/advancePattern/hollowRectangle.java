package advancePattern;

public class hollowRectangle {
    public  static  void hollow_Rectangle (int totrows , int totcolns){
        for (int i=1; i<=totrows; i++){
            for (int j=1; j<=totcolns; j++){
                if (i==1 || i==totrows || j==1 || j==totcolns){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_Rectangle(4,5);
    }

}
