class Solution {
    public int searchInsert(int[] nums, int target) {

        //the trick to this question lies in that if we don't find the target index
        //then the place at which the target should be inserted is left

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] < target){
                left++;
            }
            else if(nums[mid] > target){
                right--;
            }
            else{
                return mid;
            }
        }
        return left;
    }
}