class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer>hm = new HashMap<>();
        int max = 0;
        int res = 0;

        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
            if(hm.get(num)>max){
                max = hm.get(num);
                res = num;
            }
        }

        return res;
        
    }
}