class Solution {
    public int rob(int[] nums) {

        //the house robber according to striver approach is that 
        //the base solution of selecting and not selecting will remain same
        //but since they are arranged in a circle so the first and last one will be neighbours
        //so we will make two base cases
        //exclude first and exclude last

        //memorization

        int n = nums.length;
        if(n == 1){
            return nums[0];
        }

        //splitting
        int[]temp1 = new int[n - 1]; //excluding first
        int[]temp2 = new int[n - 1]; //excluding last

        for(int i = 0; i < n; i++){

            if(i != n -1){ //exclude last
                temp1[i] = nums[i];
            }

            if(i != 0){ //exclude last
                temp2[i-1] = nums[i];
            }
        }

        int[]dp1 = new int[n];
        int[]dp2 = new int[n];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        int ans1 = solve(temp1,dp1,temp1.length-1);
        int ans2 = solve(temp2,dp2,temp2.length-1);

        return Math.max(ans1,ans2);

        
    }

    public int solve(int[]nums, int[]dp, int n){

        if(n==0){
            return nums[0];
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        int pick = nums[n] + solve(nums, dp, n-2);
        int nonPick = 0 + solve(nums, dp, n-1);

        dp[n] = Math.max(pick,nonPick);
        return dp[n];
    }
}
