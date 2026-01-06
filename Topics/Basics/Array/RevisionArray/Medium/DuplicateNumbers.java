package Array.RevisionArray.Medium;

public class DuplicateNumbers {
    public static void DuplicateNumber(int arr[]) {
        int num = 0;

        for (int i=0; i<arr.length; i++){
            for (int j=i + 1; j<arr.length; j++){
                if (arr[i] == arr[j] && i != j){
                    System.out.println("Duplicate " + arr[j]);
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,2,4,10};
        DuplicateNumber(arr);
    }
}
