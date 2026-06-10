class Solution {
    public boolean canJump(int[] nums) {

        //from each position we can jump to that length so for each i, jump = i + nums[i];
        return jump(0,nums);
        
    }

    public boolean jump(int i, int[] nums){
        int n = nums.length;

        if(i == n-1){
            return true;
        }
        for(int jump = 1; jump <= nums[i]; jump++){
            int next = i + jump;
            if(next < n && jump(next,nums)){
                return true;
            }
        }
        return false;
    }
}
