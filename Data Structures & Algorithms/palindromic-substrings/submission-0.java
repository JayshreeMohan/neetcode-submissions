class Solution {
    public int countSubstrings(String s) {

        int count = 0;

//for counting odd palindrome
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }

        }
        //for counting even palindrome
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i+1;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;
        
    }
}
