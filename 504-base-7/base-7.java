class Solution {
    public String convertToBase7(int num) {

            int x = Math.abs(num);
            int rem = 0;
            int ques=x/7;
            rem = x%7;
            String s = Integer.toString(rem);

           while(ques>0){
               int ques2 = ques/7;
                rem = ques%7;
                ques=ques2;
                s = rem+s; 
            } 

            if(num<0){
                return '-'+s;
            }

          return s;
    }
}