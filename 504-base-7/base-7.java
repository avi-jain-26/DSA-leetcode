class Solution {
    public String convertToBase7(int num) {

            int x = Math.abs(num);
            int rem = 0;
            int ques=x;
            String s = "";

            if(x==0){
                return "0";
            }

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