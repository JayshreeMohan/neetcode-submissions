class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k%n; //doing this so that in any case if k is greater than n then we will be able to reduce the number of times array needs to be rotated

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }

    private void reverse(int[] nums, int l, int r){
        while(l<r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        l++;
        r--;
        }
    }
}