package Array;

public class findNumber {
    public static void main(String[] args) {
        int num[] = {20, 30, 40, 50, 60, 70};
        int target = 10;
        boolean found = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number is present in the array.");
        } else {
            System.out.println("Number is not present in the array.");
        }
    }
}
