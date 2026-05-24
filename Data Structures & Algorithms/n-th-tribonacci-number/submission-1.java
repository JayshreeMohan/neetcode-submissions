class Solution {
    public int tribonacci(int n) {

        //going through the memorization technique
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);
        return result(dp,n);
    }

    public int result(int[] dp, int n){
        if(n == 0){
            return 0;
        }
        
        if(n == 1 || n == 2){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = result(dp, n-1) + result(dp, n-2) + result(dp, n-3);
        return dp[n];
    }
}