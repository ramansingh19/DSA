package DSA;

public class searchinSortedMatrix {


    //Brute Force approach
    public static boolean searchSortedMatrix(int matrix[][], int target){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                             {15, 25, 35, 45},
                                  {27, 29, 37, 48},
                                        {32,33,39,50}};
        int target = 90;

        if (searchSortedMatrix(matrix, target)){
            System.out.println("Element found : "+  target);
        }else{
            System.out.println("Element not found");
        }
    }

}
