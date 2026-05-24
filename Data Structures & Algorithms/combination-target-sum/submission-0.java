class Solution {


     private void findCombinations(int ind, int[]nums, int target, List<List<Integer>>ans, List<Integer>ds){

        if(ind == nums.length){
            if(target == 0){ //means we have found the combination
                ans.add(new ArrayList<>(ds));
            } 
            return;
        }

        if(nums[ind] <= target){ //we are picking it up

            ds.add(nums[ind]);
            findCombinations(ind, nums, target-nums[ind],ans,ds);
            ds.remove(ds.size()-1); //not picking up so removing last element
        }

        findCombinations(ind+1, nums, target,ans,ds); //skipping or not pikking up
    }



    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0,nums,target,result,new ArrayList<>());
        return result;
        
    }
   
}

