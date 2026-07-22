class Solution {
    public int lengthOfLongestSubstring(String s) {

        // we will take a left pointer and a right pointer and we will keep on moving the
        //window between left and right pointer and if there occurrs a char which we have already seen
        //then it will be left = hm.get(right) + 1

        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        while(r < n){
            char c = s.charAt(r);
            if(hm.containsKey(c) && hm.get(c)>=l){
                //its already present in the ha`shmap
                l = hm.get(c) + 1;
            }

            hm.put(c,r);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }

        return maxLen;

        
    }
}
