class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans =0;
        double max =0;

         for(int [] arr : dimensions){
            int a= arr[0];
            int b= arr[1];

            double dig = Math.sqrt((a*a) + (b*b));
             
            if(dig>max){
                max = dig;
                ans = a*b;
            }else if(dig==max){
                ans = Math.max(ans,a*b);
            }
        }

        return ans;
    }
}