class Solution {
    public long maximumTripletValue(int[] nums) {
        int[] prefixmax= new int[nums.length];
        prefixmax[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            prefixmax[i]= Math.max(nums[i],prefixmax[i-1]);
        }

         int[] suffixmax= new int[nums.length];
         suffixmax[nums.length-1] = nums[nums.length-1];

        for(int i=nums.length-2; i>=0; i--){
            suffixmax[i]= Math.max(nums[i],suffixmax[i+1]);
        }
        
        long res = 0;
        for(int i=1; i<nums.length-1; i++){
            long left = prefixmax[i-1];
            long right = suffixmax[i+1];

            if(left>nums[i]){
               res = Math.max(res,(left-nums[i])*right);
            }
        }
        
        return res;
    }
}