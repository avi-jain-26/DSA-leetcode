class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] arr = new int[(2*n)];
       int ind=0;
       for(int i=0; i<n; i++){
           arr[ind] = nums[i];
           ind++;
           arr[ind]= nums[n+i];
           ind++;
       } 

       return arr;
    }
}