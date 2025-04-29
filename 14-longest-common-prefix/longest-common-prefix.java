class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
       
        String p1 = strs[0];
        String p2 = strs[strs.length-1];

       
        int i=0;
        while(i<p1.length()&& i<p2.length()&& p1.charAt(i)==p2.charAt(i)){
            i++;
        }

        return p1.substring(0,i);
       
    }
}