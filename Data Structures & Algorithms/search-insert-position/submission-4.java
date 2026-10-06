class Solution {
    public int searchInsert(int[] nums, int target) {

        //the loop coincidently runs as if there is no target then the supposed 
        //position of target is at the left index

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

        return left;   //if the element is not found then it will be on the left
        //can do dry run and find out, it comes left everytime
        
    }
}