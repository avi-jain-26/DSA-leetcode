class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum = 0;

        for(int i : nums){
            totalsum += i;
        }

        int runningsum = 0;
         for(int i =0; i<nums.length; i++){
            if(runningsum == totalsum -runningsum - nums[i]){
                return i;
            }
            runningsum +=nums[i];
         }
         return -1;
    }
}