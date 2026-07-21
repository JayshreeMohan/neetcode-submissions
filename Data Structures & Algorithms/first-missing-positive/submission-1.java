class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int missing = 1;
        for(int num : nums){
            if(missing > 0 && missing==num){
                missing++;
            }
        }
        return missing;
        
    }
}