class Solution {
    public int largestAltitude(int[] gain) {
        int max =0;
        int runningSum = 0;
        for(int i=0; i<gain.length; i++){
            
            runningSum += gain[i];
            max =  Math.max(max,runningSum);

        }
        return max;
        
    }
}