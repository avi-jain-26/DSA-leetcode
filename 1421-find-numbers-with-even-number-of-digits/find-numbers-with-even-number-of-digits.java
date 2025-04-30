class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            if(sb.length()%2==0){
                count++;
            }
        }

        return count;
    }
}