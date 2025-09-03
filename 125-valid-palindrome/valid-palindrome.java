class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int n = s.length()-1;
        System.out.print(s);
        int i =0;

        while(i<n){
            if(s.charAt(i)!=s.charAt(n)){
                return false;
            }
           i++;
           n--;
        }
        
        return true;
   }
}