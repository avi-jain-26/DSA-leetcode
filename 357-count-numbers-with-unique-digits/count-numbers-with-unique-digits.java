class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        if(n==0)
        {
            return 1;
        }
         int ans = 0;
        if(n>=1){

        int start =9;
        int curr = 9;
        ans = 10;
        for(int i=2; i<=n; i++){
            curr= curr*start;
            ans = ans+curr;
            start--;
           }
        }
        
        return ans;
    }
}