class Solution {
    public int subarraySum(int[] nums, int k) {

        int currSum = 0;
        int res = 0;

        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0,1);
    
        for(int num:nums){

           currSum += num;
           int diff = currSum-k;
           res += hm.getOrDefault(diff,0);
           hm.put(currSum,hm.getOrDefault(currSum,0)+1);

        }
        return res;
        
    }
}