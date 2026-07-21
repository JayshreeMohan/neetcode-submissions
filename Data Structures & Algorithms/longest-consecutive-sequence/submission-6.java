class Solution {
    public int longestConsecutive(int[] nums) {

        //longest consecutive subsequence is based on the idea that if i have num-1 present 
        //in the array then it is not the longest common subsequence

        HashSet<Integer> hs = new HashSet<>();
        int longest = 0;
        for(int num : nums){
            hs.add(num);
        }

        for(int num : nums){
        if(hs.contains(num-1)){
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
