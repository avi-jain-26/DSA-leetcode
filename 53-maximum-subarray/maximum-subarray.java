class Solution {
    public int maxSubArray(int[] nums) {

        // int n = nums.length;
        // int [] pre =new  int [n];
        // pre[0] = nums[0];
        // for(int i=1;i<n;i++){
        //     pre[i] = pre[i-1] + nums[i];
        // }
        
        // int max = Integer.MIN_VALUE;
        // int min = 0;

        // for(int i=0;i<n;i++){
        //     int curr = pre[i]-min;
        //     max = Math.max(max,curr);
        //     min = Math.min(min,pre[i]); 
        // }
        // return max;

       int curr =0;
        int max = Integer.MIN_VALUE;

        for(int i: nums){
            curr += i;
            max = Math.max(curr,max);
            if(curr<0){
                curr=0;
            }
        }

        return max;
    }
}