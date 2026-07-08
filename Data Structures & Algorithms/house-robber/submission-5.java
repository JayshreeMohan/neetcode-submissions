class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);
        return result(dp,nums,n-1);
        
    }

    public int result(int[]dp, int[]nums, int n){
        if(n == 0){
            return nums[0];
        }

        if(n < 0){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int pick = nums[n] + result(dp,nums,n-2);
        int nonPick = 0 + result(dp,nums,n-1);

        dp[n] = Math.max(pick,nonPick);
        return dp[n];


    }
}
