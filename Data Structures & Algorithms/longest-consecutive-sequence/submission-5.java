class Solution {
    public int longestConsecutive(int[] nums) {

        //here we are considering that if any element will be a part of longest subsequence then it will be the 
        //smallest one so if we get element -  1, we continue

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
            while(hs.contains(num + currentLength)){
                currentLength++;
            }
            if(currentLength > longest){
                longest = currentLength;
            }
        }

        return longest;
        
    }
}
