class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int diff = 0;
        int start=0;
         int sumgas=0;
         int sumcost=0;

        for(int i=0; i<n; i++){
            sumgas += gas[i];
            sumcost += cost[i];
            diff += gas[i]-cost[i];
                if(diff<0){
                    diff=0;
                    start=i+1;
                }
          }
        
        if(sumcost>sumgas){
            return -1;
        }
        else{
            return start;
        }
    }
}