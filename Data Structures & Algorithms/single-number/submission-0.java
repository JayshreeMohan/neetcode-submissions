class Solution {
    public int singleNumber(int[] nums) {

        //using hashset if the number already exist in hashset then remove it, otherwise add it
        //at the end only the unique number will remain in the hashSet

        HashSet<Integer>hs = new HashSet<>();
        for(int num:nums){
            if(hs.contains(num)){
                hs.remove(num);
            }else{
            hs.add(num);
            }
        }

        for(int val:hs){
            return val;
        }
        return -1;
        
    }
}
