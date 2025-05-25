class Solution {
    public int uniquePaths(int m, int n) {
       int[][] dp = new int[m][n];
       for(int i=0; i<dp.length; i++){
        Arrays.fill(dp[i],-1);
       }

      return solve(0,0,m-1,n-1,dp);
   }
   public static int solve(int x, int y , int m, int n, int[][] dp){
      if(x>m||y>n){
        return 0;
      }

      if(x==m || y==n){
        return 1;
      }
      if(dp[x][y]!=-1){
        return dp[x][y];
      }

      int right = solve(x,y+1,m,n,dp);
      int bottom = solve(x+1,y,m,n,dp);

       dp[x][y]= right+bottom;

      return dp[x][y];
   }
}