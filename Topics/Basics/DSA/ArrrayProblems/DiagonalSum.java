package DSA.ArrrayProblems;

public class DiagonalSum {

    public static int  DiagonalSum(int matrix[][]){
        int sum = 0;

        //primary Sum This is Brute force approach
//        for (int i=0; i<=matrix.length-1; i++){
//            for (int j=0; j<=matrix[0].length-1; j++){
//                if (i == j){
//                    sum += matrix[i][j];
//                }
//                if (i+j == matrix.length-1){
//                    sum += matrix[i][j];
//                }
//            }
//        }

        for (int i=0; i<matrix.length; i++){
            //PD
            sum += matrix[i][i];
            if (i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                                {9,10,11,12},
                                    {13,14,15,16}};
        System.out.println(DiagonalSum(matrix));
    }
}
