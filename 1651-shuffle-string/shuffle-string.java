class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char ans[] = new char[indices.length];

        for(int i =0; i<indices.length; i++){
            int ind = indices[i];
            char a = s.charAt(i);
            ans[ind] = a;
        }
        
        for(int i=0; i<ans.length; i++){
            sb.append(ans[i]);
        }

        return sb.toString();
    }
}