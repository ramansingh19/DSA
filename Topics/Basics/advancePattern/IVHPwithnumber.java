package advancePattern;

public class IVHPwithnumber {
//case 1
//    public static void inverted_pyramid_withNumber (int n) {
//        for (int i=n; i>=1; i--){
//            for (int j=1; j<n-1; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
//    }

    //case 2
    public static void inverted_pyramid_withNumber (int n) {
        for (int i=1; i<=n; i++){
            //n-i+1 = 5-1+1=5, 5-2+1=4
            for (int j=1; j<n-i+1; j++){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        inverted_pyramid_withNumber(10);
    }
}
