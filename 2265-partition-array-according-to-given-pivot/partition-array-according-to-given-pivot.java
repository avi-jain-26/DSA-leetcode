class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // int left = 0;
        // int mid = 0 ;
        // int right = 0;

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] < pivot)  left++;
        //     else if(nums[i] == pivot)  midd++;
        //     else if(nums[i] > pivot)  right++;
        // }

        int ans[] = new int[nums.length];

        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                ans[idx] = nums[i];
                idx++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot){
                ans[idx] = nums[i];
                idx++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > pivot){
                ans[idx] = nums[i];
                idx++;
            }
        }

        return ans;
    }
}