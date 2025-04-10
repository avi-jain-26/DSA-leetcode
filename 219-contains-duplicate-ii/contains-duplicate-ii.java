class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
    HashSet<Integer> set = new HashSet<>();

    for(int i =0; i<nums.length ; i++){
        
         if(i>k){
            set.remove(nums[i-k-1]);
         }
         //set me element ko add krega or return true;
         //set me duplicate elment ko add nhi krega and return false;
         if(!set.add(nums[i])){
            return true;
         }
    }

    return false;

    }
}