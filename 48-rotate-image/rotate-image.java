class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        
        //transpose swap elements except diagonals 
        //1,0 -> 0,1 || 0,2 -> 2,0.. etc

        for(int i= 0; i<len; i++){
           for(int j =i+1; j<len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse the rows now
        for(int i = 0 ; i<len ; i++){
            int left = 0; 
            int right = len-1;
             
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}