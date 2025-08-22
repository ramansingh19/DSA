package DSA.ArrrayProblems;

public class searchinSortedMatrix {


    //Brute Force approach
//    public static boolean searchSortedMatrix(int matrix[][], int target){
//        for (int i=0; i< matrix.length; i++){
//            for (int j=0; j<matrix[0].length; j++){
//                if (matrix[i][j] == target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //Staircase search approach

    public static boolean searchSortedMatrix(int matrix[][], int target){
            int row = 0;
            int col = matrix[0].length-1;

            while (row < matrix.length && col >= 0){
                if (matrix[row][col] == target){
                    System.out.print("Found the target at (" + row + ", "+ col +")");
                    return true;
                }
                else if (target < matrix[row][col]){
                    col--;
                }
                else{
                    row++;
                }
            }
        System.out.println("target not found");
            return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                             {15, 25, 35, 45},
                                  {27, 29, 37, 48},
                                        {32,33,39,50}};
        int target = 33;
        searchSortedMatrix(matrix , target);

//        if (searchSortedMatrix(matrix, target)){
//            System.out.println("Element found : "+  target);
//        }else{
//            System.out.println("Element not found");
//        }
    }

}
