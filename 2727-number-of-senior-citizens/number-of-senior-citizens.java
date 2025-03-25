class Solution {
    public int countSeniors(String[] details) {

         int count =0;

         for(int i =0; i<details.length; i++){

              int s1 = details[i].charAt(11)-'0';
             
              int s2 = details[i].charAt(12)-'0';
           
              int s = (s1*10)+s2;
              
              System.out.println(s1);
              if(s>60){
                count++;
              }

            }


         return count;
        
    }
}