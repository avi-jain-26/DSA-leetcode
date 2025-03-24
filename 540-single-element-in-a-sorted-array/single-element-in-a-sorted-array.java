
class Solution {
    public int singleNonDuplicate(int[] nums) {
       return check(nums, 0, nums.length - 1);
    }

    public static int check(int[] nums, int i, int j) {
        if (i == j) {
            return nums[i]; // Base case: single element found
        }

        int mid = i + (j - i) / 2; // Prevents integer overflow

        // Ensure mid is even (to compare with next element)
        if (mid % 2 == 1) {
            mid--;
        }

        // If pair exists, move right, else move left
        if (nums[mid] == nums[mid + 1]) {
            return check(nums, mid + 2, j);
        } else {
            return check(nums, i, mid);
        }
    }
}
