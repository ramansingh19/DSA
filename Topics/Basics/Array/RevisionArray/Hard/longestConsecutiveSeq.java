package Array.RevisionArray.Hard;

public class longestConsecutiveSeq {
    public static int longestConsecutive(int arr[]) {
        // code here
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            int count = 1;
            boolean found = true;
            while (found) {
                found = false;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == currentValue + 1) {
                        currentValue = arr[j];
                        count++;
                        found = true;
                        break;
                    }
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,90,1,3,2};
        int result = longestConsecutive(arr);

        System.out.println(result);
    }
}
