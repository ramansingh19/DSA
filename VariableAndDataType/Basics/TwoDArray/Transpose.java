package TwoDArray;

public class Transpose {

    public static void main(String[] args) {
        int arr[][] = {{2,4,5,8},
                            {9,4,3,3}};

        int row = 2;
        int coln = 4;

        int[][] trasposed = new int[coln][row];//swapped number
        for (int i=0; i< row; i++){
            for (int j=0; j< coln; j++){
                trasposed[j][i]  = arr[i][j];
            }
        }
        Printarr(trasposed);
    }

   public static void Printarr(int arr[][]){
       System.out.println("The matrix is :");
       for (int i=0; i< arr.length; i++){
           for (int j=0; j<arr[0].length; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }

   }


//    public static int[][] transpose(int arr[][]){
//        int row = arr.length;
//        int coln = arr[0].length;
//
//        //new matrix with swapped dimension
//        int[][] transposed = new int[coln][row];
//
//        for (int i=0; i<row; i++){
//            for (int j=0; j<coln; j++){
//                transposed[j][i] = arr[i][j];//swap row and column
//            }
//        }
//        return transposed;
//    }
//
//    public static void main(String[] args) {
//        int arr[][] = {{2,4,5,8},
//                            {9,4,3,3}};
//
//        int[][] result = transpose(arr);
//
//        for (int i=0; i<result.length; i++){
//            for (int j=0; j<result[0].length; j++){
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
