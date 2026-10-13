class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){return mid;} //if target at mid
            if(nums[left] <= nums[mid]){ //check if left half is sorted
                if(nums[left] <= target && nums[mid] > target){ //target is present
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{ //if right half is sorted
            if(nums[mid] < target && target <= nums[right]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }

            }
        }

        return -1 ;
        
    }
}
