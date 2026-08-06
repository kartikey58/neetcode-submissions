class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(n-1,dp,nums);
    }
    private int helper(int n,int[] dp,int[] nums){
        if(n==0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        
        int pick = nums[n]+helper(n-2,dp,nums);
        int notpick = 0+helper(n-1,dp,nums);
        return dp[n]=Math.max(pick,notpick);
    }
}