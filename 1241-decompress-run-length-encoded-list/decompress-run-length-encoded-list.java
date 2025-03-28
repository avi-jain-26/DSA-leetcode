class Solution {
    public int[] decompressRLElist(int[] nums) {
        int ind = 0; 
        int size =0;

         for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        
        int ans[] = new int[size];
        
        for(int i =0; i<nums.length; i = i+2){
           for(int j = 1; j<=nums[i]; j++){
               ans[ind] = nums[i+1];
               ind++;
           }  
        }
      return ans;
    }
}