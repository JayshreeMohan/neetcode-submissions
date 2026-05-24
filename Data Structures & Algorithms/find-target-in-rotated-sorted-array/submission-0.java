class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            //check which half is sorted, left half is sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target<nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            //right half is sorted, for every iteration we have to do it
            else{

                if(nums[mid]<target && target<=nums[high]){ //always include low and high don't include mid
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }

        return -1;
        
    }
}
