class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length-1];

        int minLen = Math.min(firstStr.length(),lastStr.length());

        int i = 0;

        while(i < minLen && firstStr.charAt(i)==lastStr.charAt(i)){
            i++;
        }

        return firstStr.substring(0,i);

        
        
    }
}