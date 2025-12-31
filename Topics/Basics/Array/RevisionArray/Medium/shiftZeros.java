package Array.RevisionArray.Medium;

public class shiftZeros {
    public static void shiftZeros(int arr[]){
        int index = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length){
            arr[index] = 0;
            index++;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,0,9,0,3,0,4};
        shiftZeros(arr);

        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
