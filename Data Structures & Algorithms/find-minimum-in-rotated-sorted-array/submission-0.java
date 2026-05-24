class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int low = 0;
        int high = n-1;
        int minValue = Integer.MAX_VALUE;

        while(low<=high){
            if(nums[low] <= nums[high]){ //array is already sorted
                minValue = Math.min(minValue,nums[low]);
                break;
            }   

            int mid = low + (high-low)/2;
            //find out which half is sorted
            if(nums[low] <= nums[mid]) {  //left half is sorted
                minValue = Math.min(minValue,nums[low]);
                low = mid+1; //to check if there is another minimum in other half
            }

            else{
                minValue = Math.min(minValue,nums[mid]);
                high = mid-1;
            }
        }

        return minValue;
        
    }
}
