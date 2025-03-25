class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int count =0;
         int cons =0;

         for(int i =0; i<nums.length; i++){
            if(nums[i]==1){
                count++;

            }
           else{
                cons = Math.max(count,cons);
                count=0;
            }
         }

         return Math.max(count,cons);
    }
}