class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(result(cost,dp,n-1), result(cost,dp,n-2));
        
    }

    public int result(int[] cost, int[] dp, int n ){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int oneStep = result(cost,dp,n-1);
        int twoStep = result(cost,dp,n-2);

        dp[n] = cost[n] + Math.min(oneStep,twoStep);
        return dp[n];
    }
}
