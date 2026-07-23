class Solution {
    public String mergeAlternately(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();
        int i = 0;
        int j = 0;

        StringBuilder res = new StringBuilder();

        while(i < m && j < n){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }

        while(i < m){
            res.append(word1.charAt(i++));
        }

        while(j < n){
            res.append(word2.charAt(j++));
        }

        return res.toString();
        
    }
}