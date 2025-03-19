class Solution {
    public int maxProfit(int[] price) {
        int Bprice= Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<price.length; i++){
           
                int profit = price[i] - Bprice;
                maxprofit= Math.max(profit, maxprofit);
                Bprice = Math.min(Bprice, price[i]);
        }
        return maxprofit;
         
    }
}