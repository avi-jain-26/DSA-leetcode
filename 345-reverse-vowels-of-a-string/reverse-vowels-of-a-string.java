class Solution {
    public String reverseVowels(String s) {
       
        int i=0;
        char[] index = s.toCharArray();
         int k = index.length-1; 
        while(i<k){
           while(!isvowel(index[i]) && i<k){
            i++;
           }
           while(!isvowel(index[k]) && i<k){
            k--;
           }

           char temp = index[i];
           index[i]= index[k];
           index[k] =temp;

           i++;
           k--;
        }

        return new String(index);
    }

    public static boolean isvowel(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch== 'A' || ch == 'E' || ch=='I' ||ch=='O' || ch=='U'){
           return true;
        }
       
         return false; 
    }
}