class Solution {
    static int lowerbound(int[] nums, int x, int n){
        int low=0, high= n-1;
        int ans =n;

        while(high>=low){
             int mid = (low+high)/2;
             if(nums[mid]>=x){
                ans = mid;
                high = mid-1;
             }
             else{
                low=mid+1;
             }
        }

        return ans;
    }

     static int upperbound(int[] nums, int x, int n){
        int low=0, high= n-1;
        int ans =n;

        while(high>=low){
             int mid = (low+high)/2;
             if(nums[mid]>x){
                ans = mid;
                high = mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int lb = lowerbound(nums, target, nums.length);
        if(lb==nums.length || nums[lb]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{lb,upperbound(nums,target,nums.length)-1};
    }
}