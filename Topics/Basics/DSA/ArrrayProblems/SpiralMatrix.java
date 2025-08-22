package DSA.ArrrayProblems;

public class SpiralMatrix {

    public static void sprialMatrix(int matrix[][]){
        int startrow = 0;
        int startcoln = 0;
        int endrow = matrix.length-1;
        int endcoln = matrix[0].length-1;

        while (startrow <= endrow && startcoln <= endcoln){
            //top
            for (int j=startcoln; j<=endcoln; j++){
                System.out.print(matrix[startrow][j] + " ");
            }
            //right
            for (int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcoln] + " ");
            }
            //bottom
            for (int j=endcoln-1; j>=startcoln; j--){
                if (startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            //left
            for (int i=endrow-1; i>=startrow+1; i--){
                if (startcoln == endcoln){
                    break;
                }
                System.out.print(matrix[i][startcoln] + " ");
            }
            startcoln++;
            startrow++;
            endrow--;
            endcoln--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                                {9,10,11,12},
                                    {13,14,15,16},
                                        {17,18,19,20}};
        sprialMatrix(matrix);
    }


}
