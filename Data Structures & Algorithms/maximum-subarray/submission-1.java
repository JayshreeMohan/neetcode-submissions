class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int ans = nums[0];

        int[]dp = new int[n];
        for(int i = 0; i < n; i++){
            dp[i] = Integer.MIN_VALUE;
            ans = Math.max(ans,solve(i,nums,dp));
        }
        return ans;
    }

    public int solve(int i, int[] nums, int[]dp){
        if(i == 0){
            return nums[0];
        }

        if(dp[i] != Integer.MIN_VALUE){
            return dp[i];
        }

        int notTake = nums[i];
        int take = nums[i] + solve(i-1,nums,dp);

        return dp[i] = Math.max(take,notTake);
    }
}
