class Solution {
    public String longestPalindrome(String s) {
         String ans ="";
        int maxlen =0;
        
        for(int i=0; i<s.length(); i++){
            
            String curr =  ispalindrome(s,i,i);
            String curr2 =  ispalindrome(s,i,i+1);
            
            String ans2;
            
            if(curr.length()>curr2.length()){
                ans2=curr;
            }
            else{
                ans2=curr2;
            }
        
            
            if(ans2.length()>maxlen){
                maxlen= ans2.length();
                ans = ans2;
            }
            
        }
        
        return ans;
    }

    static String ispalindrome(String s, int start, int end){
        while(start>=0 && end<s.length()){
            if(s.charAt(start)==s.charAt(end)){
                start--;
                end++;
            }
            else{
                break;
            }
        }
        
        return s.substring(start+1,end);
        
    }


}