class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
   

    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[i].length; j++){
    //            if(matrix[i][j] == target){
    //             return true;
    //            }
    //         }
    //     }
    // return false;    

    //binary search
    int row = matrix.length;
    int col = matrix[0].length;

    int left =0; 
    int right = col*row - 1;
    
    while(left<=right){
        int mid = right-left/2;
        int val = matrix[mid/col][mid%col];

        if(target==val){
            return true;
        }
        else if(target>val){
            left = mid +1;
        }
        else{
            right = mid-1;
        }
    }
    
    return false;

  }
}