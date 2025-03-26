class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int totalsum = 0;
        int n = nums.length;
        int leftsum = 0;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            totalsum += nums[i];
        }


        for(int i=0; i<n; i++){
            int leftval = (nums[i]*i) - leftsum;

            int rightval = totalsum - leftsum - (nums[i]*(n-i));

            leftsum += nums[i];

            ans[i] = leftval+rightval;
        }

        return ans;
    }
}