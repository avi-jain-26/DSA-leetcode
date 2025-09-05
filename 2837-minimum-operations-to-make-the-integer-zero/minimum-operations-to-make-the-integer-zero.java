class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
       
       long a =1;

       while(true){

        long val = (long)(num1 - a * num2);

        if(val<0){
            return -1;
        }
         int bits = Long.bitCount(val);

        if( bits <= a && a <= val){
              return (int)a;
        } 

        a++;
    }
 }
}