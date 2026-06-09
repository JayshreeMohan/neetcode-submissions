class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int ans = nums[0];

        for(int i = 0; i < n; i++){
            ans = Math.max(ans, solve(i, nums));
        }
        return ans;
    }

    public int solve(int i, int[] nums){
        if(i == 0){
            return nums[0];
        }

        //for maximum subarray we can either consider the current array as max subarray, or can add each element in max subarray
        int notTake = nums[i];
        int take = nums[i] + solve(i-1, nums);

        return Math.max(take,notTake);
    }
}
