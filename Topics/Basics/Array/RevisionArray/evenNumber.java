package Array.RevisionArray;

public class evenNumber {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,10};

        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 == 0 ){
                System.out.print("Even"+ " ");
            }else {
                System.out.println("odd");
            }
        }
    }
}
