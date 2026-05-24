class Solution {
    public int rob(int[] nums) {

        //so the circular house robber problem will be like we can't take first and
        //last together since they are circular, so we will take first and n-2
        //or 0 and n-1
        //and after that we will apply normal house robber on both

        if(nums.length == 1){
            return nums[0];
        }

        return Math.max(
            helper(Arrays.copyOfRange(nums,0,nums.length-1)),
            helper(Arrays.copyOfRange(nums,1,nums.length))
        );
        
    }

    public int helper(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];  //if only one house is there
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i < nums.length; i++){
            int pick = nums[i] + dp[i-2];
            int notPick = dp[i-1];

            dp[i] = Math.max(pick,notPick);
        }
         return dp[nums.length - 1];
    }

}
