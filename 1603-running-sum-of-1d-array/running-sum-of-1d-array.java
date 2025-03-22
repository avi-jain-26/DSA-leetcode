class Solution {
    public int[] runningSum(int[] nums) {
         int runningsum =0;

         for(int i=1; i<nums.length; i++){
             runningsum = nums[i]+nums[i-1];
             nums[i] = runningsum;
         }

         return nums;
    }
}