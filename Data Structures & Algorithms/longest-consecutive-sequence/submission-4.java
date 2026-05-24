class Solution {
    public int longestConsecutive(int[] nums) {

        //we continue if element - 1 is present in the hashmap because if the longest consequence exist
        //then the current element should be the smallest one, if is not the smallest one then
        //the subsequence is not the largest one

        // we are considering a hashmap because even if the element repeats, then it won't effect

        HashSet<Integer> hs = new HashSet<>();

        for(int num : nums){
            hs.add(num);
        }

        int longest = 0;

        for(int num : nums){
            if(hs.contains(num - 1)){
                continue;
            }

            int currentLength = 1;

            while(hs.contains(currentLength + num)){
                currentLength++;
            }
            if(currentLength > longest){
                longest = currentLength;
            }
        }

        return longest;
        
    }
}
