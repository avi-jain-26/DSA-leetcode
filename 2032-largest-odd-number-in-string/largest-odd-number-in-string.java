class Solution {
    public String largestOddNumber(String num) {
        if(num.length()==0){
            return "";
        }
        StringBuilder sb = new StringBuilder(num);

        for(int i=num.length()-1; i>=0; i--){
            if((num.charAt(i)-'0')%2 == 0){
                sb.deleteCharAt(i);
            }
            else{
                break;
            }
        }

        return sb.toString();
    }
}