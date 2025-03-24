class Solution {
    public int search(int[] nums, int target) {
        
        return check(nums,0,nums.length-1,target);

    }

    // public int bs(int[] nums, int i, int j, int target){
        
    //    if(i>j){
    //         return -1;
    //     }

    //     int mid = (i+j)/2;

    //     if(nums[mid]==target){
    //         return mid;
    //     }
        
    //     if(nums[mid]>target){
    //      return bs(nums, i, mid-1, target);
    //     }
         
    //     return bs(nums,mid+1,j,target);
    // }
    
    public static int check(int[] nums, int i, int j, int target){

        if(i>j){
            return -1;
        }

        int mid = (i+j)/2;

        if(nums[mid]==target){
            return mid;
        }

        if(nums[mid]>target){
            return check(nums, i, mid-1, target);
        }
      return check(nums,mid+1, j, target);
    }
}