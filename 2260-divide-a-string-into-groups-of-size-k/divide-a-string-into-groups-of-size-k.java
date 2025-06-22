class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int m = (n + k - 1) / k;
        int Startidx=0; 

        String[] arr = new String[m];

        for(int i=0; i<m; i++){
            int lastindx = Math.min(Startidx + k, n);
            arr[i] = s.substring(Startidx,lastindx);
            while(arr[i].length()<k){
                arr[i]+=fill;
            }   
             Startidx = lastindx;
        }

        return arr;
        
    }
}