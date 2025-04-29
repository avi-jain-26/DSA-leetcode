class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int max= 0;
        // int i=0; 
        // int j=0;
        // HashSet<Character> set = new HashSet<>();
        // while(i<s.length()){
        //     if(!set.contains(s.charAt(i))){
        //        set.add(s.charAt(i));
        //        max = Math.max(i-j+1,max);
        //        i++;
        //     }
        //     else{
        //         set.remove(s.charAt(j));
        //         j++;
        //     }
        // }
        // return max;

        int[] dict = new int[256];
        for (int i = 0; i < 256; i++) {
            dict[i] = -1;
        }

        int maxLen = 0, start = -1;
        for (int i = 0; i < s.length(); i++) {
            if (dict[s.charAt(i)] > start) {
                start = dict[s.charAt(i)];
            }
            dict[s.charAt(i)] = i;
            maxLen = Math.max(maxLen, i - start);
        }

        return maxLen;
    }
}