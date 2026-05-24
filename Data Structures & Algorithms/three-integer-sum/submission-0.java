class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue; //to remove duplicates
            }

            int left = i+1;
            int right = n-1;
            while(left < right){
                int currSum = nums[left]+nums[i]+nums[right];
                if(currSum == 0){
                    ans.add(Arrays.asList(nums[left],nums[i],nums[right]));
                

                //remove duplicates
                while(left < right && nums[left]==nums[left+1]){
                    left++;
                }

                //remove duplicates
                while(left < right && nums[right]==nums[right-1]){
                    right--;
                }
                left++;
                right--;
            }

            else if(currSum > 0){
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
