class Solution {
    private void findSubsets(int ind, int[] arr, List<Integer>ds, List<List<Integer>>ans){

        if(ind==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(arr[ind]);
        findSubsets(ind+1, arr, ds, ans);
        ds.remove(ds.size()-1);
        findSubsets(ind+1, arr, ds, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>>ans = new ArrayList<>();
        findSubsets(0,nums, new ArrayList<>(),ans);
        return ans;
        
    }
}
