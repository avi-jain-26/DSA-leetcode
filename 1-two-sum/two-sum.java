class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        // for(int i =0; i<nums.length; i++){
        //      for(int j =i+1; j<nums.length; j++){
        //     if(nums[i]+nums[j]==target){
        //        return new int[]{i,j};
        //     }
        // }

        // }
        // return new int[]{};
        
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}