class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int tot = n*n;

        boolean seen[] = new boolean[tot+1];
        int dup = -1;
        int mis = -1;
        
        for(int[] row : grid){
            for(int num: row){
                if(seen[num]){
                    dup = num;
                }
                seen[num] = true;
            }
        }


        for(int i = 1 ; i<=tot; i++){
            if(!seen[i]){
                mis = i;
                break;
            }
        }

        return new int[] {dup,mis};
    }
}