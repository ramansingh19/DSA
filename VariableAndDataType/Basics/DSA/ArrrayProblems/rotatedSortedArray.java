package DSA.ArrrayProblems;

public class rotatedSortedArray {

        public static int search(int[] nums, int target) {
            int low = 0, high = nums.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                // Target
                if (nums[mid] == target) {
                    return mid;
                }

                // Check if left half [low to mid] is sorted
                if (nums[low] <= nums[mid]) {
                    if (nums[low] <= target && target < nums[mid]) {
                        high = mid - 1; // Move to left half
                    } else {
                        low = mid + 1; // Move to right half
                    }
                }
                // Otherwise, right half [mid to high] is sorted
                else {
                    if (nums[mid] < target && target <= nums[high]) {
                        low = mid + 1; // Move to right half
                    } else {
                        high = mid - 1; // Move to left half
                    }
                }
            }

            return -1; // Target not found
        }

        public static void main(String[] args) {
            int[] nums = {4,5,6,7,0,1,2};
            int target = 0;

            int result = search(nums, target);
            System.out.println("Index of target: " + result);












        }

}
