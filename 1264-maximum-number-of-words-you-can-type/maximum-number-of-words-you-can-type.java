class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        int ans =0;
        Set<Character> brok = new HashSet<>();
 
        for(char a : brokenLetters.toCharArray()){
            brok.add(a);
        }

        String arr[] = text.split(" ");
         
         for(String w : arr){
            for(char c : w.toCharArray()){
                if(brok.contains(c)){
                    ans++;
                    break;
                }
            }
         }
        
        return arr.length - ans;
    }
}