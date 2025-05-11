class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int i =0;
        int count =0;

        if(arr.length==0){
            return false;
        }

        while(i<arr.length){
           if(arr[i]%2!=0){
               count++;
              if(count==3){
                return true;
               }
            }
            else{ 
                count=0;
            }
             i++;
        }

       return false;
    }
}