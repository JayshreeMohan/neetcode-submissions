class Solution {
    public int climbStairs(int n) {

        //memorization
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        return result(dp,n);
    }

    public int result(int[]dp, int n){
        if(n==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = result(dp,n-1) + result(dp,n-2);
        return dp[n];
        
    }
}
