class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            
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
        return left; //if the target is not found then l will be the most suitable position to fit the target because l lies just before or equal to r so instead of -1 , returning l
    }
}