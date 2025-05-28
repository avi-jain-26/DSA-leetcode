class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
       int[][] dp = new int[n+1][n+1];
       for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
       }
       return helper(triangle, 0 ,0, dp );
    }

    public static int helper(List<List<Integer>> triangle, int i, int j, int[][] dp){
        int n = triangle.size();

        if(i==n-1 || j==n-1){
            return triangle.get(i).get(j);
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int down = helper(triangle,i+1,j,dp);
        int dig= helper(triangle,i+1,j+1,dp);

        return dp[i][j]= triangle.get(i).get(j) + Math.min(down,dig);
    }
}