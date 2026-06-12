class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,nums,target,ans,new ArrayList<>());
        return ans;
    }

    public void findCombination(int index, int[] nums, int target, List<List<Integer>>ans, List<Integer>ds){
        if(index == nums.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(nums[index] <=target){ //include the number, picking up
            ds.add(nums[index]);
            findCombination(index,nums,target-nums[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        //not picking up
        findCombination(index+1, nums, target,ans,ds);
    }
}
