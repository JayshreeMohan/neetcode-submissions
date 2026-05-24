class Solution {
    public int searchInsert(int[] nums, int target) {

        // if the target is found then its ok , if it is not found then the target should be there at the left index
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left++;
            }
            else{
                right--;
            }
        }

        return left;
        
    }
}