class Solution {
    
    public int totalNQueens(int n) {
      boolean arr[][] = new boolean [n][n];
      return solve(arr,0,n);  
    }

    public int solve(boolean arr[][],int r, int n){
        if(r == n) return 1;
        int val = 0;
        for(int c = 0; c < n; c++){
            if(isQueenValid(arr,c,r)){
                arr[r][c]=true;
                val += solve(arr, r+1, n);
                arr[r][c] = false;
            }
        }
        return val;
    }

    public boolean isQueenValid(boolean arr[][],int c,int r){
            int i = r;
            int j = c;
            int n = arr.length;

            while(i >= 0){
                if(arr[i][j]) return false;
                i--;
            }

                i = r; 
                j = c;
            while (i >= 0 && j >=0){
                if (arr[i][j]) return false;
                i--;
                j--;
            }

                i = r; 
                j = c;
            while (i >= 0 && j < n){
                if (arr[i][j]) return false;
                i--;
                j++;
            }
          return true;
    }
}