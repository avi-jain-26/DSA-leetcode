class Solution {
    public int minimumOperations(int[] nums) {

        int n = nums.length;
        int op =0;
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<n; i++){
            ls.add(nums[i]);
        }
     

        while(true){
            HashSet<Integer> set = new HashSet<>();
            boolean hasDuplicate = false;

            for (int i : ls) {
                if (!set.add(i)) {
                    hasDuplicate = true;
                    break; 
                }
            }
          
            if (!hasDuplicate) {
               break;
            }
            
                int min = Math.min(3,ls.size());
                ls.subList(0, min).clear();
                op++;
        }
        
        return op;
    }
}