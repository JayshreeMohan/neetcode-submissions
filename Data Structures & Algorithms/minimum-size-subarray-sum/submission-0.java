class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int l = 0;
        int total = 0;
        int minimumLength = Integer.MAX_VALUE;

        for(int r=0;r<n;r++){
            total += nums[r];

            while(total>=target){
                minimumLength = Math.min(r-l+1,minimumLength);
                total = total-nums[l];
                l++;
            }
        }

        return minimumLength == Integer.MAX_VALUE ? 0 : minimumLength;
        
    }
}