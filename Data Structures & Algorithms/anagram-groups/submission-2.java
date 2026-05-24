class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //to group anangram we will take a hashmap of string and list of string, the list of string will contain the group of anangram

        HashMap<String,List<String>>hm = new HashMap<>();

        for(String str: strs){

            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);

            hm.putIfAbsent(newString, new ArrayList<>());
            hm.get(newString).add(str);

        } 

        return new ArrayList<>(hm.values());
        
    }
}
