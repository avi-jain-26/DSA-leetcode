class Solution {
    public boolean canPartition(int[] nums) {
       
       int sum = 0;
       int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
       }

        if (sum % 2 == 0) {
            sum = sum / 2;
        } 
        else {
             return false;
        }
     //return subset(nums, sum, 0, n);

       // top down 
       int [][] dp = new int[n][sum+1];
        for (int i = 0; i< dp.length; i++) {
           for(int j=0;  j< dp[0].length; j++){
            dp[i][j] = -1;
           }
        }

        return memosubset(nums,sum,0,n,dp);




     //bottom up

    //  boolean [][] dp = new boolean[n+1][sum+1];

    //   for (int i = 0; i <= n; i++) {
    //        dp[i][0] = true; 
    //     }
              
    //  for(int i= n-1;i>=0;i--){
    //      for(int j=0;j<=sum;j++){
    //             boolean exclude = dp[i+1][j];
    //             boolean include = false;
        

    //              if(j-nums[i]>=0){
    //                  include = dp[i+1][j-nums[i]];
    //                }

    //          dp[i][j] = include||exclude;
    //         }
    //    }

    //  return dp[0][sum];

   }

    //reccursion

//     public static int subset(int[] arr, int target, int N, int A) {

//     if (target == 0) {
//       return true;
//     }

//     if (target < 0|| N>=A) {
//       return false;
//     }

//     boolean Nontake = subset(arr, target, N + 1, A);

//     boolean take = subset(arr, target - arr[N], N + 1, A);

//     return (take || Nontake);
//   }


   // TOP-DOWN (with boolean to int approach)

    public static boolean memosubset(int[] arr, int target, int N, int A, int[][] dp){
        
    if (target == 0) {
      return true;
    }

    if (target < 0|| N>=A) {
      return false;
    }

    if(dp[N][target]!=-1){
        return (dp[N][target]==1);
    }

    
    boolean Nontake = memosubset(arr, target, N + 1, A,dp);
    boolean take = false;

    if(target>=arr[N]){
       take = memosubset(arr, target - arr[N], N + 1, A,dp);
    }

    boolean res = (take || Nontake);

       if(res==true){
        dp[N][target]=1;
       }

       else{
        dp[N][target]=0;
       }

    return res;

    }

  
}