class Solution {
    public boolean isPalindrome(String s) {

        String t = s.toLowerCase();
        int left = 0;
        int right = t.length() - 1;

        while(left < right){
            //left space and other elements removal
            while(left < right && !Character.isLetterOrDigit(t.charAt(left))){
                left++;
            }
            //space or other element removal from right side
            while(left < right && !Character.isLetterOrDigit(t.charAt(right))){
                right--;
            }
            if(t.charAt(left)!=t.charAt(right)){
                return false;
            }
            left++;
            right--;

        }

        return true;
        
        
    }
}
