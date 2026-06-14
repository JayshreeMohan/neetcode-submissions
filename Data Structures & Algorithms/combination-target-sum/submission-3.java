class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        combination(0,nums,target,ans,new ArrayList<>());
        return ans;
        
    }

    public void combination(int index, int[] nums, int target, List<List<Integer>> ans, List<Integer> ds){

        if(index == nums.length){
            if(target == 0){
            ans.add(new ArrayList<>(ds));
            }
            return;
        }

        else if(nums[index] <= target){ //we will include this
            ds.add(nums[index]);
            combination(index, nums, target-nums[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        //excluding the current index and moving forward
        combination(index+1, nums, target, ans, ds);


    }
}
