class Solution {
    public String minWindow(String s, String t) {

        Map<Character,Integer>hm = new HashMap<>();
        for(char c: t.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        

        int left = 0;
        int right = 0;

        int count = hm.size();
        int minlength = Integer.MAX_VALUE;
        int startIndex = 0;

        //initially while expanding the window

        while(right < s.length()){
            char ch = s.charAt(right);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    count--;
                }
            }

            //shrinking the window

            while(count==0){
                if(right-left+1 < minlength){
                    minlength = right-left+1;
                    startIndex = left;
                }

//removing element from the left
                char leftchar = s.charAt(left);
                if(hm.containsKey(leftchar)){
                    hm.put(leftchar,hm.get(leftchar)+1);
                    if(hm.get(leftchar) > 0){
                        count++;
                    } //that element is missing
                }
                left++;
            }
            right++;
        }
        return minlength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minlength);

    }
}
