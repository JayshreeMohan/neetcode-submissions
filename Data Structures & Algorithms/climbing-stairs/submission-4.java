class Solution {
    public int climbStairs(int n) {

        //memorizarion
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);

        return solve(dp,n);
        
    }
    public int solve(int[] dp, int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0; //the base case that I left
        }
        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = solve(dp,n-1) + solve(dp,n-2); //only two ways to climb the stairs either jump1 or jump 2
        return dp[n];
    }

}
