class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //for 3 sum we will use one more loop for the third element
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n-2; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue; // to remove duplicates
            }
            int left = i+1;
            int right = n-1;

            while(left < right){
                int target = nums[i] + nums[left] + nums[right];

                if(target == 0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    //remove left duplicates
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }

                    //remove right duplicates
                    while(left < right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(target > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
        
    }
}
