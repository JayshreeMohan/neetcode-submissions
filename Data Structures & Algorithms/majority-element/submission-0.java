class Solution {
    public int majorityElement(int[] nums) {

        int max = 0;
        int res = 0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int num: nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
            if(hm.get(num)>max){
                max = hm.get(num);
                res = num;
            }

        }

        return res;
        
    }
}