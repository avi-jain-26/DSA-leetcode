class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count =0;
        int majEle =0;
        for(int i=0;i<n;i++){
            if(count==0) majEle = nums[i];
            if(nums[i]==majEle) count++;
            else count--;

        }
        return majEle;
    }
}