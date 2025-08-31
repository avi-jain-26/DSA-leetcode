class Solution {
    public int minInsertions(String s) {
        StringBuilder b = new StringBuilder();
        b.append(s).reverse();
        String s2 = b.toString();

        int len1 = s.length();
        int len2 = s.length();

        int[][] dp = new int[len1+1][len2+1];

        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }

        int lps = LCS(s,s2,len1,len2,dp);
        return len1-lps;
    }

    int LCS(String s, String b, int i, int j, int[][]dp){
        if(i==0 || j==0){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s.charAt(i-1) == b.charAt(j-1)){
            dp[i][j]= 1+ LCS(s,b,i-1,j-1,dp);
        }
        else{
            dp[i][j] = Math.max(LCS(s,b,i-1,j,dp),LCS(s,b,i,j-1,dp));
        }

        return dp[i][j];
    }
}