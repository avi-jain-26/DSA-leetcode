class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
       long res;

        if(x<0){
          sb.deleteCharAt(s.length()-1);
          s= sb.toString();
          res = Long.parseLong(s);
          res = res*(-1);
        }
        else{
          s = sb.toString();
          res = Long.parseLong(s);
        }

        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE){
            return 0;
        }

        return (int) res;

        
    }
}