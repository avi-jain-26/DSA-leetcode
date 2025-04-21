class Solution {
    public String largestNumber(int[] nums) {

        String[] s = new String[nums.length];
        
        for(int i=0;i<nums.length;i++){
            s[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));

        if(s[0].equals("0")){
             return "0";
        }

        StringBuilder res = new StringBuilder();

        for(int i=0;i<s.length;i++){
            res.append(s[i]);
        }

        return res.toString();
    }
}