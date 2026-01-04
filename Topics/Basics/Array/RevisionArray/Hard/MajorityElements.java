package Array.RevisionArray.Hard;

public class MajorityElements {

    public static void majorityElement(int arr[]) {
        int candidate = arr[0];
        int count = 1;

        for (int i=1; i<arr.length; i++){
            if (arr[i] == candidate){
                count++;
            }else {
                count--;
            }
            if (count == 0){
                candidate = arr[i];
                count++;
            }
        }
        count = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == candidate){
                count++;
            }
        }
        if (count > arr.length/2){
            System.out.print("majority Number " + candidate);
        }else {
            System.out.print("no majority number");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,3,4,2,3,3,3,3,3};
        majorityElement(arr);
    }
}
