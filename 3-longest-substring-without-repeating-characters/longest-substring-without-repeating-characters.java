class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max= 0;
        int i=0; 
        int j=0;
        HashSet<Character> set = new HashSet<>();

        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
               set.add(s.charAt(i));
               max = Math.max(i-j+1,max);
               i++;
            }
            else{
                set.remove(s.charAt(j));
                j++;
            }
        }
        return max;

    }
}