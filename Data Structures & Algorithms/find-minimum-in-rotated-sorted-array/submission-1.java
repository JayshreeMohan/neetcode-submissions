class Solution {
    public int findMin(int[] nums) {

        //since the array is roatated sorted so we have to check in each half, in
        //any half the array could have been sorted and min could be there
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int minValue = Integer.MAX_VALUE;

        while(left <= right){
            if(nums[left] <= nums[right]){
                minValue = Math.min(nums[left],minValue);
                break;
            }
            int mid = left + (right - left) / 2;
            if(nums[left] <= nums[mid]){ //left part is sorted
                minValue = Math.min(nums[left],minValue);
                left = mid + 1; //to see if min exists in the other half
            }
            else{
                minValue = Math.min(nums[mid],minValue); //right sorted
                right = mid - 1; //to check for min in the other half
            }


        }

        return minValue;
        
    }
}
