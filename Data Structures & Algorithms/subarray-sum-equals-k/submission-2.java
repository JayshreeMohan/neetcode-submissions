class Solution {
    public int subarraySum(int[] nums, int k) {

        //it is based on the idea that if we calcualte the prefix sum of ex=ach element
        //and if prefixsum - k exists in the hashmap then it is one of our ans

        //for prefix sum we will not keep an array, just keep a variable

        //we will initialize a hashmap to store the prefix sum and how many times it occurred

        int res = 0;
        int prefixSum = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        for(int num : nums){
            prefixSum += num;
            int diff = prefixSum - k;
            res += hm.getOrDefault(diff,0);

            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }

        return res;


        
    }
}