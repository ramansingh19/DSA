package Array.RevisionArray.Hard;

public class findmissingNUmber {
    public static int MissingNumber(int arr[]){
        int s = arr.length+1;
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int actualNum = s * (s + 1)/2;
        System.out.println(actualNum);
        int missingNumber = actualNum - sum;
        return missingNumber;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5};

        System.out.println(MissingNumber(arr));
    }
}
