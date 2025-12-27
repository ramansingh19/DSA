package Array.RevisionArray.Normal;

public class copyElement {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        int carray[] = new int[arr.length];

        for (int i=0; i<arr.length; i++){
                carray[i] = arr[i];
            System.out.print(arr[i] + " ");
        }
        for (int i=0; i< carray.length; i++){
            System.out.print(carray[i] + " ");
        }
    }
}
