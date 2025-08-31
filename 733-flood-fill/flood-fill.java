class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor = image[sr][sc];
        if(oldcolor == color) return image;
        dfs(image,sr,sc,oldcolor,color);
        return image;
    }

    public void dfs(int[][] image, int i, int j, int oldcolor, int newcolor){
        if(i<0 || j<0|| i>=image.length|| j>=image[0].length){
            return;
        }

        if(image[i][j] != oldcolor){
            return;
        }

        image[i][j]= newcolor;

        dfs(image, i+1,j,oldcolor,newcolor);
         dfs(image, i-1,j,oldcolor,newcolor);
          dfs(image, i,j+1,oldcolor,newcolor);
           dfs(image, i,j-1,oldcolor,newcolor);
    } 
}