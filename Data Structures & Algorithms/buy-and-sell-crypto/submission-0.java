class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        int min = prices[0];

        for(int i =0;i<prices.length;i++){
                min = Math.min(min,prices[i]);
                int currdiff=prices[i]-min;
                diff= Math.max(diff,currdiff);
            
        }
        return diff;
    }
}