class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i=0; i<word1.length; i++){
            str.append(word1[i]);
        }
        for(int i=0; i<word2.length; i++){
            str2.append(word2[i]);
        }

      String a =  str.toString();
     String b   =    str2.toString();

      if(a.equals(b)){
        return true;
      }

        return false;
    }
}