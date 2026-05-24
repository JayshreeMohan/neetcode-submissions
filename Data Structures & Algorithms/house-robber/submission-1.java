class Solution {
    public int rob(int[] nums) {

        //since we can't take the money from both houses so we have two options
        //one either take the money from the house, then we will take from i-2
        //don't take money from the current house, then we will take the money from i-1 house

        int n = nums.length;
        int[]dp = new int[n];

        for(int i = 0; i < n; i++){
            dp[i] = -1;  //initially initialised all to -1 to calculate uncomputed state
        }

       return robRecursion(nums, n-1, dp); //index is n-1 because the approach is bottoms up
        
    }

    public int robRecursion(int[] nums, int index, int[] dp){

        if(index < 0){
            return 0;
        }

        if(index == 0){
            return nums[0]; //because if we are at 0 index means only one house to rob, then we have only one option to rob it.
        }

        if(dp[index] != -1){
            return dp[index];
        }

        //means we are robbing the current house;
        int rob = nums[index] + robRecursion(nums,index-2,dp);

        //if we are not robbing the current house
        int notRob = robRecursion(nums,index-1,dp);

        dp[index] = Math.max(rob,notRob);
        return dp[index];



    }
}
