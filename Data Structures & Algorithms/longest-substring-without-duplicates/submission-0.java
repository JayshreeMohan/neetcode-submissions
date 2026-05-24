class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        HashMap<Character,Integer>hm = new HashMap<>();

        while(r<n){
            char ch = s.charAt(r);
            if(hm.containsKey(ch) && hm.get(ch)>=l){
                //its already present in hashmap
                l = hm.get(ch)+1;
            }
            hm.put(ch,r);
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
        
    }
}
