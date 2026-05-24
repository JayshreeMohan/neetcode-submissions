class Solution {


    private void findSubsets(int ind, int[]nums, List<Integer>ds, Set<List<Integer>>ans){

        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[ind]);//pick
        findSubsets(ind+1, nums, ds, ans);
        ds.remove(ds.size()-1);//not pick
        findSubsets(ind+1, nums, ds, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Set<List<Integer>>ans = new HashSet<>();
        Arrays.sort(nums);
        findSubsets(0,nums,new ArrayList<>(),ans);
        return new ArrayList<>(ans);
        
    }
}
