package TwoDArray;


import java.util.Scanner;

public class largestElement {

    public static void LargestNumber(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int r = -1 , c = -1;

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] > largest){
                    largest = matrix[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        System.out.println("Largest Number: " + largest + " at position (" + r + "," + c + ")");

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        LargestNumber(matrix);
    }
}
