package DSA.ArrrayProblems;

public class rotatedSortedArray {

        public static int search(int nums[], int target) {
            int start = 0, end = nums.length - 1;

            //
            while (start <= end) {
                //find mid in the shelf
                int mid = start + (end - start) / 2;

                // Target
                if (nums[mid] == target) {
                    return mid;
                }

                // Check if left half [start to mid] is sorted
                if (nums[start] <= nums[mid]) {
                    if (nums[start] <= target && target < nums[mid]) {
                        end = mid - 1; // Move to left half
                    } else {
                        start = mid + 1; // Move to right half
                    }
                }
                // Otherwise, right half [mid to end] is sorted
                else {
                    if (nums[mid] < target && target <= nums[end]) {
                        start = mid + 1; // Move to right half
                    } else {
                        end = mid - 1; // Move to left half
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
