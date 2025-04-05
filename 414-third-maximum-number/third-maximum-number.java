class Solution {
    public int thirdMax(int[] nums) {
        

        /*int index= nums.length-1;
        int c=1;
        while(index>0 && c<3){
           if(nums[index] == nums[index-1]){
            index--;
            c++;
           }
        }
        return nums[index];  */

        Arrays.sort(nums);

        int largest = 1;

        for(int i=nums.length-1; i>0; i--){
            if(nums[i] != nums[i-1]){
                largest++;

                if(largest == 3){
                    return nums[i-1];
                }
            }
        }

        return nums[nums.length-1];
    }
}