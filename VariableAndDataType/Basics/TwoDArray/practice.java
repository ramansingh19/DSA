package TwoDArray;

public class practice {

    public static void SpiralMatrix(int matrix[][]){
        int startrow = 0;
        int startcoln = 0;
        int endrow = matrix.length-1;
        int endcoln = matrix[0].length-1;

        while (startrow <= endrow && startcoln <= endcoln){
            //top
            for (int i=startcoln; i<=endcoln; i++){
                System.out.print(matrix[startrow][i] + " ");
            }
            //right
            for (int j=startrow+1; j<=endrow; j++){
                System.out.print(matrix[j][endcoln] + " ");
            }
            //bottom
            for (int i=endcoln-1; i>=startcoln; i--){
                if (startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][i] + " ");
            }//top
            for (int j=endrow-1; j>=startrow+1; j--){
                if (startcoln == endcoln){
                    break;
                }
                System.out.print(matrix[j][startcoln]+ " ");
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
        SpiralMatrix(matrix);
    }
}
