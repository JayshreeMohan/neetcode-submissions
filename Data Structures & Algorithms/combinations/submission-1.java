class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        combination(1,n,k,ans,new ArrayList<>());
        return ans;
        
    }

    public void combination(int index, int n, int k, List<List<Integer>>ans, List<Integer>ds){
        if(index > n){
            //we have to take the subset of size k
            if(ds.size() == k){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //pick
        ds.add(index);
        combination(index+1, n, k, ans, ds);
        ds.remove(ds.size()-1);
        //not pick
        combination(index+1, n, k, ans, ds);
        
    }
}