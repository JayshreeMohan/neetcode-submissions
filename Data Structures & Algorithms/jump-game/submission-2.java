class Solution {
    public boolean canJump(int[] nums) {
        //solve using memorization
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        return solve(0,nums,dp);
        
    }

    public boolean solve(int i, int[] nums, int[]dp){
        int n = nums.length;
        if(i == n-1){
            return true;
        }

        if(dp[i] != -1){
            return dp[i] == 1;
        }

        for(int jump = 1; jump <= nums[i]; jump++){
            int next = i + jump;

            if(next < n && solve(next,nums,dp)){
                dp[i] = 1;
                return true;
            }
        }
        dp[i] = 0;
        return false;
    }
}
