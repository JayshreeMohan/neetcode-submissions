class Solution {
    public String longestCommonPrefix(String[] strs) {

        //we are sorting the array so that there is maximum difference between first and last , then we can find the common prefix in first and last
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        int minLength = Math.min(first.length(),last.length());

        int i=0;

        while(i<minLength && first.charAt(i)==last.charAt(i)){
            i++;
        }

        return first.substring(0,i);
        
    }
}