class Solution {
    public int rob(int[] nums) {

        //tabulation
        int n = nums.length;
        int[]dp = new int[n+1];

        dp[0] = 0;  // if we are considering n+1 then there are no elements at nums[0], it is 0
        dp[1] = nums[0];

        for(int i = 2; i<=n; i++){
            int pick = nums[i-1] + dp[i-2];
            int nonPick = 0 + dp[i-1];

            dp[i] = Math.max(nonPick,pick);
        }

        return dp[n];
        
    }
}
