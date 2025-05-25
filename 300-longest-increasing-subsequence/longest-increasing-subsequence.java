class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,-1,nums,dp);
    }

    public static int solve(int i, int j, int[] nums, int[][] dp){

        int n = nums.length;
        if(i==n){
            return 0;
        }
        
        if(dp[i][j+1]!=-1){
            return dp[i][j+1];
        }

        int nontake = solve(i+1,j,nums,dp);
        int take = 0;

        if(j==-1 || nums[i]>nums[j]){
           take = 1+solve(i+1,i,nums,dp);
        }

        return dp[i][j+1]= Math.max(nontake,take);
        
    }
}