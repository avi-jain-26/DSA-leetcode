class Solution {
    public int search(int[] nums, int target) {
         int i =0;
         while(i<=nums.length-1){
            if(nums[i]==target){
                return i;
            }
            i++;
         }
         return -1;
    }
}