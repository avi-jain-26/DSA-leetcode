class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] dp = new int[m][n];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,m-1,n-1,obstacleGrid,dp);
    }
    public static int solve(int i , int j ,int m, int n, int[][] obs, int[][] dp){
        if(i>m || j>n || obs[i][j]==1){
            return 0;
        }

        if(i==m && j==n){
            return 1;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int ryt = solve(i,j+1,m,n,obs,dp);
        int bot = solve(i+1,j,m,n,obs,dp);
        
       return dp[i][j] = ryt+bot;
        
    }

}