class Solution {
    public int differenceOfSums(int n, int m) {
        int ans = 0;
        int ans2 =0;
        for(int i=1; i<=n; i++){

            if(i%m==0){
                ans = ans + i;
            }
            else{
                ans2 = ans2+ i;
            }
        }

      return (ans2-ans);
    }
}