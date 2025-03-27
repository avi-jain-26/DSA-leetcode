class Solution {
    public int[] runningSum(int[] nums) {
         int runningsum =0;

         for(int i=0; i<nums.length; i++){
             runningsum += nums[i];
             nums[i] = runningsum;
         }

         return nums;
    }
}