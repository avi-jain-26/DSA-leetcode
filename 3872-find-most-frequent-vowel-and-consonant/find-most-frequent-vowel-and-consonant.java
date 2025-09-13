class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int maxV = 0;
        int maxC = 0;
        
        String v = "aeiou";
        
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            int val = freq[i];
            
            if (v.indexOf(c) != -1) {
                maxV = Math.max(maxV, val);
            } else {
                maxC = Math.max(maxC, val);
            }
        }
        
        return maxV + maxC;
    }
}