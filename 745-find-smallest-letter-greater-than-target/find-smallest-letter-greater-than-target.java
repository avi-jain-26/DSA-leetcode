class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tarval = target - '0';
        int want = 0;

        int[] ans = new int[letters.length];

        for(int i=0; i<letters.length; i++){
            ans[i] = letters[i] -'0';
        }
       
       for(int i=0; i<ans.length; i++){
         if(ans[i]>tarval){
           return (char)(ans[i] + '0');
         }
       }

       return letters[0];
    }
}