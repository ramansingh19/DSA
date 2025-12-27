package Array.RevisionArray.Normal;

public class duplicate {
    public static int Duplicate(int arr[]){
        int i =0;
        for (int j=0; j<arr.length; j++){
            if (arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return  i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,5,6};
        int result = Duplicate(arr);

        for (int i=0; i < result ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
