class Solution {
    public String longestPalindrome(String s) {

        //to find the longest palindrome in a string, we will use a character of palindrome
        //that is a palindrome expands identically from its centre
        //whether it is an even length palindrome or an odd one
        //so we will consider each character as the mid point of palindrome

        //only one difference will be there that in case of odd length palindrome
        //l and r will start from same index
        //in case of even l =i, r =i+1

        //odd Length

        int resIndex = 0;
        int resLength = 0;

        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;

            while(left >=0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            
            if(right - left + 1 > resLength){
                resLength = right - left + 1;
                resIndex = left;
            }
            left--;
            right++;
            }
        }

        //for even length palindrome

        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i+1;

            while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
                if(right - left + 1 > resLength){
                    resLength = right - left + 1;
                    resIndex = left;
                }
                left--;
                right++;
            }
        }

    return s.substring(resIndex, resIndex+resLength);
        
    }
}
