package Array.RevisionArray.Normal;

public class MajorityElements {

    public static void majorityElement(int arr[]) {
        int candidate = arr[0];
        int count = 1;

        // Step 1: Find candidate
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 6, 8, 2, 2, 4, 6, 8};
        majorityElement(arr);
    }
}
