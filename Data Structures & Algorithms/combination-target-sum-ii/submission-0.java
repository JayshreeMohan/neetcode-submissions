class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Set<List<Integer>> ans = new HashSet<List<Integer>>();
        Arrays.sort(candidates); //bcoz needed in lexicographical

        recursion(0,candidates,target,ans,new ArrayList<>());
        return new ArrayList<>(ans);
        
    }

    private void recursion(int ind, int[] candidates, int target, Set<List<Integer>>ans, List<Integer>ds){

        if(ind == candidates.length){
            if(target==0){ //means we got a match
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[ind] <= target){
            ds.add(candidates[ind]); //include or pick
            recursion(ind+1,candidates,target-candidates[ind],ans,ds);
            ds.remove(ds.size()-1);
        }

        recursion(ind+1,candidates,target,ans,ds); //not pick
        //added 1 in both pick and not pick becoz here we don't have to repeat the element
    }
}
