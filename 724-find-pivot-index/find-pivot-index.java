// class Solution {
//     public int pivotIndex(int[] nums) {
//         int n = nums.length;
//         int [] pre =  new int[n];
//         pre[0] = nums[0];
//         for(int i=1;i<n;i++){
//             pre[i] =pre[i-1]+nums[i];
//         }
//         int [] pos = new int[n];
//         pos[n-1] = nums[n-1];
//         for(int i=n-2;i>=0;i--){
//             pos[i] = pos[i+1] + nums[i];
//         }
//         for(int i=0;i<n;i++){
//             if(pos[i]==pre[i])
//                 return i;
//         }
//         return -1;

//     }
// }



class Solution {
    public static int fn(int [] nums){
        int helper =0;
        for(int el : nums){
            helper+=el;
        }
        return helper;
    }
     public int pivotIndex(int[] nums) {
        int n = nums.length;
        int runningSum =0;
        int totalSum = fn(nums);
        if(nums[0]==totalSum) return 0;
        for(int i=0;i<n;i++){
            int rightOne = totalSum - nums[i] - runningSum;
            if (runningSum == rightOne) {
                return i;
            }
            runningSum += nums[i]; 
        }
        return -1;

    

    }
}