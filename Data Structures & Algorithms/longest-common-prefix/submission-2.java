class Solution {
    public String longestCommonPrefix(String[] strs) {

// for finding the longest common string we have to sort the string
//and then take the first one and the last one because they have the 
//largest difference. also we will find the min difference between them
//because the shorter string can exceed the minimum length

    Arrays.sort(strs);
    String firstString = strs[0];
    String lastString = strs[strs.length-1];

    int minLength = Math.min(firstString.length(),lastString.length());

    int i = 0;

    while(i < minLength && firstString.charAt(i)==lastString.charAt(i)){
        i++;
    }


return firstString.substring(0,i);

        
    }
}