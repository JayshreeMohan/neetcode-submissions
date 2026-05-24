class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s:strs){
            char[]arr = s.toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);

            hm.putIfAbsent(newString,new ArrayList<>());
            hm.get(newString).add(s);
        }

        return new ArrayList<>(hm.values());
        
    }
}
