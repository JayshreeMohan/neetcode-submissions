class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            //check if left half is sorted
            if(nums[low] <= nums[mid]){
                //and if the target lies within that half
                if(nums[low]<=target && target<nums[mid]){ //always include low and high don't need to include mid
                    high = mid-1;
                } 
                else{
                    low = mid+1;
                }

            }

            else{
                if(nums[mid] < target && target<=nums[high]){
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
