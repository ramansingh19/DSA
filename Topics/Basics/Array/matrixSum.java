package Array;

public class matrixSum {
    public static void main(String[] args) {

        //printing the element of 2-D Array

        int[][] matrix1 = {{1,2,3},
                            {2,3,4}};
        int[][] matrix2 = {{1,2,3},
                            {2,3,4}};
        int[][] result = {{0,0,0},
                            {0,0,0}};

        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[i].length; j++){
                System.out.format("set for i=%d and j=%d value\n", i ,j);
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }

    }
}
