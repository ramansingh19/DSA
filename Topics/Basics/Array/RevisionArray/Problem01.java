package Array.RevisionArray;

import java.util.Scanner;

public class Problem01 {
    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i] +  1;
        }
    }
    public static void main(String[] args) {
//        int marks[] = new int[50];
//        Scanner sc = new Scanner(System.in);
//
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();
//
//        System.out.println("phy :"+ marks[0]);
//        System.out.println("che :"+ marks[1]);
//        System.out.println("maths :"+ marks[2]);

        //by reference
        int marks[] = {90, 91, 92};
        update(marks);
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
