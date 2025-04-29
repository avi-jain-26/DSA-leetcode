class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                ans +=hm.get(sum-k);
            } hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}