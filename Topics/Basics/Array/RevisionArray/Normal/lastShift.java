package Array.RevisionArray.Normal;

public class lastShift {
    public static void rightshift(int arr[]){
        int lastnnum = arr[arr.length-1];

        for (int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastnnum;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        rightshift(arr);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
