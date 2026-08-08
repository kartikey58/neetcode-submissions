class Solution {
    public int coinChange(int[] coins, int amount) {
         int n = coins.length;

        int[] dp = new int[amount + 1];

        
            Arrays.fill(dp,(int)1e9);

        dp[0]=0;
        for(int coin:coins){
            for(int T=coin;T<=amount;T++){
                dp[T]=Math.min(dp[T],1+dp[T-coin]);
            }
        }
        return dp[amount]==(int)1e9 ? -1 :dp[amount];
    }
    
}