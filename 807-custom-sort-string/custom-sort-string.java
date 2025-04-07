class Solution {
    public String customSortString(String order, String s) {

         StringBuilder sb = new StringBuilder(s);
         StringBuilder ans = new StringBuilder();
          
         for(int i=0; i<order.length(); i++){
            for(int j=0; j<sb.length();){
                if(order.charAt(i)==sb.charAt(j)){
                    ans.append(order.charAt(i));
                    sb.deleteCharAt(j);
                } 
                else{
                    j++;
                }
            }
         }

       ans.append(sb);

       return ans.toString();


          
    }
}